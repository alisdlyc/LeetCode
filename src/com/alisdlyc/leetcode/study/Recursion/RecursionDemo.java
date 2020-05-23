package com.alisdlyc.leetcode.study.Recursion;

public class RecursionDemo {
    private static final int MAX_LEVEL = 5;

    public static void main(String[] args) {

    }

    public void recur(int level, int param) {

        // terminator
        if (level > MAX_LEVEL) {
            // process result
            return;
        }

        // process current logic
        process(level, param);

        // drill down
        int newParam = 0;
        recur(level + 1, newParam);

        // restore current status
    }

    private void process(int level, int param) {
    }
}
