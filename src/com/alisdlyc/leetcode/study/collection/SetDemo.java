package com.alisdlyc.leetcode.study.collection;

import java.util.*;

/**
* Set用于存储不重复的元素集合
*  + Set实际上相当于不存储Value的Map
*  + Set用于去除重复元素
*  + 放入Set的元素要正确实现quuals 和 hashcode
 *  + HashSet是无序的
 *  + TreeSet是有序的
 *  + 实现Sorted接口的是有序Set
*
* */
public class SetDemo {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });

        set.add("orange");
        set.add("apple");
        set.add("banana");
        for (String s : set) {
            System.out.println("Hashset不保证有序,treeset按元素的排序顺序排序--->" + s);
        }

        List<String> list = Arrays.asList("pear", "apple", "qwq", "monoid", "qwq", "monoid");
        System.out.println("原始的list为----------------------->" + list.toString());

        /*通过将set转换为HashSet可以去除重复的元素*/
        /*通过将set转换为TreeSet可以去除重复的元素,并且将结果按照key排序*/
        Set<String> moveSet = new HashSet<>(list);
        System.out.println("通过HashSet去重之后为---------------------->" + moveSet.toString());

        Set<String> moveTreeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });
        moveTreeSet.addAll(list);
        System.out.println("使用treeset并且自定义排序算法------------------------>" + moveTreeSet.toString());
    }
}
