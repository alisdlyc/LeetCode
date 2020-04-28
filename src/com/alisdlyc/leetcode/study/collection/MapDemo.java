package com.alisdlyc.leetcode.study.collection;

import com.alisdlyc.leetcode.study.utils.Person;

import java.util.*;

/**
 * Map是一种键-值映射表
 * 可以通过 key 快速的查找 value (元素)
 * 要实现对key的排序使用 TreeMap，TreeMap可以实现Comparator，对key进行排序
 */
public class MapDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("aqwq", 1), new Person("ovo", 2), new Person("a嘤嘤嘤", 21));

        /*使用TreeMap,可以输出map中key的排序顺序*/
        Map<String, Person> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*使用倒序的方法打印TreeMap*/
                return - o1.compareTo(o2);
            }
        });
//        Map<String, Person> map = new HashMap<>();
        for (Person p : list) {
            map.put(p.getName(), p);
        }
        System.out.println(map.get("qwq"));
        System.out.println(map.get("sai"));
        System.out.println();

        System.out.println("迭代map的所有key,但是打印时的顺序不一定是放入的顺序");
        for (String key : map.keySet()) {
            System.out.println(key + "------>" + map.get(key));
        }

        /*通过entry迭代出key和value*/
        System.out.println();
        System.out.println("通过entry迭代");
        for (Map.Entry<String, Person> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"--->" + entry.getValue());
        }
    }
}
