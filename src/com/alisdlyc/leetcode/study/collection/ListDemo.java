package com.alisdlyc.leetcode.study.collection;

import java.util.*;

/**
 * @author 14287
 * ArrayList: 内部使用数组存储所有元素，越界时，用一个更长的数组替换原来的数组
 * LinkedList：内部每个元素都指向下一个元素
 * 优先使用ArrayList
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*使用LinkedList和ArrayList的结果是完全一样的*/
//        List<String> list = new LinkedList<>();
        list.add("qwq");
        list.add("ovo");
        list.add("嘤嘤嘤");
        /*使用for-each 输出*/
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("通过get方法遍历：");
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("通过迭代器:");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        System.out.println();

        /*将List转换为数组*/
        System.out.println("将List转换为数组");
        String[] str = list.toArray(new String[list.size()]);
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println();

        /*将数组转换为List*/
        System.out.println("将数组转换为List");
        List<String> lst = new ArrayList<>(Arrays.asList(str));
        for (String s : lst) {
            System.out.println(s);
        }

    }
}
