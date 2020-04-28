package com.alisdlyc.leetcode.study.utils;

/**
 * 让自己编写的集合使用 for-each循环
 * + 实现 Iterator 接口
 * + 返回 Iterator 对象
 * + 用 Iterator 对象迭代
 * */
public class IteratorDemo {
    public static void main(String[] args) {
        ReadOnlyList<String> list = new ReadOnlyList<>("apple","pears","orange");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
