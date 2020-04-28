package com.alisdlyc.leetcode.study.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StackTest {
    private static int hex = 16;

    public static void main(String[] args) {
        System.out.println("请输入一个十进制整数:");
        Scanner scanner = new Scanner(System.in);
        int re = scanner.nextInt();
        System.out.println(toHex(re));
    }

    private static String toHex(int num) {
        Deque<String> stack = new LinkedList<>();
        StringBuilder re = new StringBuilder();

        do {
            stack.push(String.valueOf(num-(num/hex)*hex));
            num /= hex;
            if (num < hex) {
                stack.push(String.valueOf(num));
                num = 0;
            }

        } while (num != 0);
        do {
            re.append(stack.pop());
        } while (stack.peek() != null);
        return re.toString();
    }
}
