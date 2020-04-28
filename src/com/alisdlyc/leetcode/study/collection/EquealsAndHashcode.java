package com.alisdlyc.leetcode.study.collection;

import com.alisdlyc.leetcode.study.utils.Person;

import java.util.*;

/**
 * 正确使用map必须保证
 * 1、作为key的对象必须正确覆写equals()方法
 * 2、作为key的对象必须正确覆写hashcode()方法：
 *   + 如果两个对象相等，则两个对象的hashcode()必须相等
 *   + 如果两个对象不相等，则两个对象的hashcode()不需要相等
 * */
public class EquealsAndHashcode {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(new Person("qwq" , 11), new Person("ovo" ,213), new Person("sas" ,12)));
        System.out.println(list);
        Map<Person, String> map = new HashMap<>();
        for (Person p : list) {
            map.put(p, p.getName());
        }
        System.out.println(map.get(new Person("qwq", 11)));
    }
}
