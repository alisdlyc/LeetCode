package com.alisdlyc.leetcode.study.collection;

import com.alisdlyc.leetcode.study.utils.Person;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 在Java中LinkedList实现了Queue接口
 * 可以将LinkedList作为Queue
 * + throw Exception  |   false or true
 * + add              |   offer         | 添加元素到队尾
 * + remove           |   poll          | 获取队列头部元素并删除
 * + element          |   peek          | 获取队列头部元素但不删除
 *
 * PriorityQueue 的出队顺序与元素的优先级有关
 * - remove 或者 poll 的时候，总是取优先级最高的元素
 * - Person cannot be cast to java.lang.Comparable
 * - - Person类需要实现Comparable接口
 * */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("qwq", 1));
        queue.offer(new Person("ovo", 2));
        queue.offer(new Person("sos", 3));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        if (!queue.isEmpty()) {
            /*queue为null时候会抛异常*/
            System.out.println(queue.remove());

        }

        /*需要Person类实现 Comparator接口， 也可以直接实现*/
        Queue<Person> personQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return - String.valueOf(o1.age).compareTo(String.valueOf(o2.age));
            }
        });
        personQueue.offer(new Person("qwq", 12));
        personQueue.offer(new Person("ovo", 13));
        personQueue.offer(new Person("sos", 14));

        System.out.println();
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
    }
}
