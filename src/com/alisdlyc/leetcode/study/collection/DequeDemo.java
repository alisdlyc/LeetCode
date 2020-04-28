package com.alisdlyc.leetcode.study.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque 实现一个双端队列 (Double Enable Queue)
 * + 既可以添加元素到队尾，也可以添加元素到对首
 * + 既可以从队首获取，也可以从队尾获取元素
 *      Queue           |       Deque
 *      add/offer       |   addLast/offerLast       添加元素到队尾
 *      remove/poll     |   removeFrist/pollFrist   取队首元素并删除
 *      element/peek    |   getFirst/peekFirst      取队首元素但不删除
 *
 *                      |   addFirst/offerFirst     添加元素到队首
 *                      |   removeLast/pollLast     取队尾元素并删除
 *                      |   getLast/peekLast        取队尾元素但不删除
 *      Deque的实现类：
 *      + ArrayDeque
 *      + LinkedList
 *      面向接口编程尽量实现接口，而不是实现类
 * + + + 避免将null添加到队列
 * */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerFirst("End");
        deque.offerFirst("A");
        deque.offerFirst("B");
        deque.offerFirst("C");
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
