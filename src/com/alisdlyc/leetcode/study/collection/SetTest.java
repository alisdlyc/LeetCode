package com.alisdlyc.leetcode.study.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
* 将List中的元素去重，但保留元素在List中的原始顺序
* */
public class SetTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","xyz","abc","www","edu","www","abc");
        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
