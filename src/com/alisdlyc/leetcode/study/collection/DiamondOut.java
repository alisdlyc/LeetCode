package com.alisdlyc.leetcode.study.collection;

/**
 * 输出一个简单的菱形
 *
 * */
public class DiamondOut {
    private static int rows = 10;
    public static void main(String[] args) {
        for (int i = 0; i < DiamondOut.rows; i++) {
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
