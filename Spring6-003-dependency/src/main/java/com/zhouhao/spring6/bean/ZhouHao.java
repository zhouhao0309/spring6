package com.zhouhao.spring6.bean;

import java.util.Arrays;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-23 17:50
 **/
public class ZhouHao {
    private String[] aihaos;

    private Women[] womens;

    public void setAihaos(String[] aihaos) {
        this.aihaos = aihaos;
    }

    @Override
    public String toString() {
        return "ZhouHao{" +
                "aihaos=" + Arrays.toString(aihaos) +
                ", womens=" + Arrays.toString(womens) +
                '}';
    }

    public void setWomens(Women[] womens) {
        this.womens = womens;
    }

}
