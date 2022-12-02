package com.zhouhao.myspring.frame.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: spring6
 * @description: ClassPathXmlApplicationContext类
 * @author: 周浩
 * @create: 2022-11-30 22:59
 **/
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private static final Logger logger= LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);
    //创建Map集合
    private Map<String, Object> singletonObjects= new HashMap<>();

    @Override
    public Object getBean(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 解析myspring当中的配置文件，然后初始化所有的bean对象
     * @param configLocation spring配置文件的路径，配置文件应当放到类路径下
     */
    //解析xml文件，然后实例化bean，将bean存放到集合当中

    public ClassPathXmlApplicationContext(String configLocation) throws DocumentException {
        //1.dom4j的解析文件的核心对象
        SAXReader reader = new SAXReader();
        //2.获取配置文件的输入流(这个文件的位置只能在类路径下面)
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
        //3.读文件
        Document document = reader.read(in);
        //4.获取所有的bean标签
        List<Node> nodes = document.selectNodes("//bean");
        //5.遍历bean标签
        nodes.forEach(node ->{
            Element beanElt = (Element) node;
            //获取id
            String id = beanElt.attributeValue("id");
            //获取class
            String classname = beanElt.attributeValue("class");

            logger.info("name="+id);
            logger.info("classname="+id);
            //通过反射机制提前曝光，放到Map集合当中
            try {
                //获取Class
                Class<?> aClass = Class.forName(classname);
                //获取无参数构造方法
                Constructor<?> defaultCon = aClass.getDeclaredConstructor();
                //调用无参数构造方法实例化bean
                Object bean = defaultCon.newInstance();
                //将bean曝光，加入Map集合
                singletonObjects.put(id,bean);
                logger.info(singletonObjects.toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });

        //再次遍历所有的bean标签，主要给属性赋值
        nodes.forEach(node -> {

            try {
                Element beanElt = (Element) node;
                String id = beanElt.attributeValue("id");
                String className = beanElt.attributeValue("class");
                //获取Class
                Class<?> aClass = Class.forName(className);
                //获取bean下的所有子标签
                List<Element> properties = beanElt.elements("property");
                //遍历
                properties.forEach(propertie ->{
                    try {
                        //获取属性名
                        String propertyName = propertie.attributeValue("name");
                        //获取属性类型
                        Field declaredField = aClass.getDeclaredField(propertyName);
//                        logger.info(declaredField.getType().getName());
//                        logger.info(declaredField.getType().getSimpleName());
                        logger.info(declaredField.getType().toString());
                        logger.info(propertyName);
                        //获取set方法名
                        String setName="set"+propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
                        //获取set方法
                        Method method = aClass.getDeclaredMethod(setName, declaredField.getType());
                        //获取具体的值
                        String value = propertie.attributeValue("value");
                        Object actualValue = null; //真值
                        String ref = propertie.attributeValue("ref");
                        //调用set方法
                        if (value != null) {
//                            获取属性类型名
                            String propertyTypeSimpleName = declaredField.getType().getSimpleName();
                            switch (propertyTypeSimpleName) {
                                case "byte":
                                    actualValue = Byte.parseByte(value);
                                    break;
                                case "short":
                                    actualValue = Short.parseShort(value);
                                    break;
                                case "int":
                                    actualValue = Integer.parseInt(value);
                                    break;
                                case "long":
                                    actualValue = Long.parseLong(value);
                                    break;
                                case "float":
                                    actualValue = Float.parseFloat(value);
                                    break;
                                case "double":
                                    actualValue = Double.parseDouble(value);
                                    break;
                                case "boolean":
                                    actualValue = Boolean.parseBoolean(value);
                                    break;
                                case "char":
                                    actualValue = value.charAt(0);
                                    break;
                                case "Byte":
                                    actualValue = Byte.valueOf(value);
                                    break;
                                case "Short":
                                    actualValue = Short.valueOf(value);
                                    break;
                                case "Integer":
                                    actualValue = Integer.valueOf(value);
                                    break;
                                case "Long":
                                    actualValue = Long.valueOf(value);
                                    break;
                                case "Float":
                                    actualValue = Float.valueOf(value);
                                    break;
                                case "Double":
                                    actualValue = Double.valueOf(value);
                                    break;
                                case "Boolean":
                                    actualValue = Boolean.valueOf(value);
                                    break;
                                case "Character":
                                    actualValue = Character.valueOf(value.charAt(0));
                                    break;
                                case "String":
                                    actualValue = value;
                            }
                            method.invoke(singletonObjects.get(id),actualValue);
                        }
                        if (ref != null) {
                            method.invoke(singletonObjects.get(id),singletonObjects.get(ref));
                        }
                    } catch (NoSuchFieldException e) {
                        throw new RuntimeException(e);
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }

                });

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        });
    }
}
