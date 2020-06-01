package com.alisdlyc.BuptOJ.editor.en;

import java.util.Scanner;

/**
 * @author 14287
 */
public class Solution_288 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tag = scanner.nextInt();
        int[] re = new int[2];

        while (tag > 0) {
            int nums = scanner.nextInt();
            re[0] = 0;
            re[1] = 0;

            while (nums > 0){
                int i = scanner.nextInt();

                if (i % 2 == 0) {
                    re[0] += i;
                } else {
                    re[1] += i;
                }
                nums--;
            }
            System.out.println(re[1]+" "+re[0]);
            tag--;
        }
    }
}
