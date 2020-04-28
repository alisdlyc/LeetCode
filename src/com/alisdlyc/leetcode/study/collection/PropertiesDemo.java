package com.alisdlyc.leetcode.study.collection;

import java.io.IOException;
import java.util.Properties;

/**
 *Properties用于读写配置文件
 * 只能使用Assic编码
 * 读写properties时，仅使用getProperties和 setProperties
 */

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(PropertiesDemo.class.getResourceAsStream("../utils/setting.properties"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("qwq"));
        System.out.println(properties.getProperty("ovo", "default content"));
    }
}
