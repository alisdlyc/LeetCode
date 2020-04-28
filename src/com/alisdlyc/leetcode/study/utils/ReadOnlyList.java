package com.alisdlyc.leetcode.study.utils;

import java.util.Iterator;


/**
 * 使用 Iterator模式进行迭代的好处：
 *  + 对任何集合都采用同一种访问模型
 *  + 调用者对集合内部结构一无所知
 *  + 集合类返回的 Iterator对象知道如何迭代
 *  + Iterator是一种抽象的数据访问模型
 * */
public class ReadOnlyList<E> implements Iterable<E>{

    E[] array;

    @SafeVarargs
    public ReadOnlyList(E... array) {
        this.array = array;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReadOnlyIterator();
    }

    class ReadOnlyIterator implements Iterator<E> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < ReadOnlyList.this.array.length;
        }

        @Override
        public E next() {
            E e = array[index];
            index++;
            return e;
        }
    }
}
