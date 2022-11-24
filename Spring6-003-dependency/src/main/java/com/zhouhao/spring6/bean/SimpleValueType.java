package com.zhouhao.spring6.bean;

import org.springframework.util.ClassUtils;

import java.net.URI;
import java.net.URL;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;

/**
 * @program: spring6
 * @description: 简单注入类bean
 * @author: 周浩
 * @create: 2022-11-23 12:51
 **/
public class SimpleValueType {
//    public static boolean isSimpleValueType(Class<?> type) {
//        return (Void.class != type && void.class != type &&
//                (ClassUtils.isPrimitiveOrWrapper(type) ||
//                        Enum.class.isAssignableFrom(type) ||
//                        CharSequence.class.isAssignableFrom(type) ||
//                        Number.class.isAssignableFrom(type) ||
//                        Date.class.isAssignableFrom(type) ||
//                        Temporal.class.isAssignableFrom(type) ||
//                        URI.class == type ||
//                        URL.class == type ||
//                        Locale.class == type ||
//                        Class.class == type));
//    }

    private Date date;

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
