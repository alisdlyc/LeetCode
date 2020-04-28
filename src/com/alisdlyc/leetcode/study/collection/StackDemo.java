package com.alisdlyc.leetcode.study.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * push |   pop
 * 实现类 Deque
 * + push   ->  addFirst
 * + pop    ->  removeFirst
 * + peek   ->  peekFirst
 *
 * - 栈的应用：
 *      1、进制转换
 *      2、逆波兰表达式
 * */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("qwq");
        stack.push("qwq");
        stack.push("qwq");
        stack.push("qwq");
        stack.push("qwq");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
