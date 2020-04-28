package com.alisdlyc.leetcode.study.utils;

import com.sun.javafx.UnmodifiableArrayList;

import java.nio.channels.AsynchronousChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * + Collections 是JDK提供的工具类：
 *   + boolean addAll() 给collection类集合添加若干元素
 *   + 创建空集合 （不可变）：
 *      - List<T> emptyList()
 *      - Map<K,V> emptyMap()
 *      - Set<T> emptySet
 *   + 创建单元素集合 （不可变）
 *      - Set<T> singleton(T o)
 *      - List<T> singletonList(T o)
 *      - Map<K,V> singletonMap(K key, V value)
 *   + 对list进行排序 （必须传入可变List）：
 *      - void sort(List<T> list)
 *      - void sort(List<T> list, Comparator<? super T> c)
 *   + 随机重置List的元素(洗牌)：
 *      - void shuffle(List<?> list)
 *   + 将可变集合变为不可变集合
 *      - UnmodifiableArrayList<>()
 *
 * */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("qwq", "ovo", "sos"));
        System.out.println(list);
        /*Collections.unmodifiableList() 将List变为不可变的List*/
//        list.add("qwq");
    }
}
