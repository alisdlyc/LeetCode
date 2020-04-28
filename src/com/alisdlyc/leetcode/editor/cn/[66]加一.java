//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组

/**
 * class Solution {
 *     public int[] plusOne(int[] digits) {
 *         if (digits.length == 0) {
 *             int[] re = new int[1];
 *             re[0] = 1;
 *             return re;
 *         }
 *
 *         int addFlag = 1;
 *         int i = digits.length - 1;
 *         do {
 *             digits[i] += addFlag;
 *             addFlag = digits[i] / 10;
 *             if (addFlag == 1){
 *                 digits[i] %= 10;
 *             }
 *             i--;
 *         } while (addFlag != 0 && i >= 0);
 *
 *         if (addFlag == 1) {
 *             int[] re= new int[digits.length + 1];
 *             re[0] = 1;
 *             for (int j = 1; j < re.length; j++) {
 *                 re[j] = digits[j - 1];
 *             }
 *             return re;
 *         }
 *
 *         return digits;
 *     }
 * }
 *
 *简化版
 * class Solution {
 *     public int[] plusOne(int[] digits) {
 *         for (int i = digits.length -1; i >= 0; i--) {
 *             digits[i]++;
 *             digits[i] %= 10;
 *             if (digits[i] != 0) {
 *                 return digits;
 *             }
 *         }
 *         digits = new int[digits.length + 1];
 *         digits[0] = 1;
 *         return digits;
 *     }
 * }
 *
 *
 * 再简化
 * class Solution {
 *     public int[] plusOne(int[] digits) {
 *         for (int i = digits.length -1; i >= 0; i--) {
 *             if (digits[i] < 9) {
 *                 digits[i]++;
 *                 return digits;
 *             }
 *             digits[i] = 0;
 *         }
 *
 *         //由于最后一位存在进位只会是 100000
 *         int[] newDigits = new int[digits.length + 1];
 *         newDigits[0] = 1;
 *         return newDigits;
 *     }
 * }
 * */
import javax.swing.*;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int[] plusOne(int[] digits) {
//        for (int i = digits.length -1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits;
//            }
//            digits[i] = 0;
//        }
//
//        //由于最后一位存在进位只会是 100000
//        int[] newDigits = new int[digits.length + 1];
//        newDigits[0] = 1;
//        return newDigits;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
