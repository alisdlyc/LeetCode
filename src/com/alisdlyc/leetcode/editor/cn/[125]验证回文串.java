//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串
/**
 * 1、通过正则判断字符的范围是否为 a-z A-Z
 * 2、若字符的范围匹配，则通过双指针匹配，不匹配时返回false
 * 3、指针相遇时，放回true
 * class Solution {
 *     public boolean isPalindrome(String s) {
 *         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
 *         char[] c = s.toCharArray();
 *         int i = 0;
 *         int j = c.length - 1;
 *
 *         while (i < j) {
 *             if (c[i] != c[j]) {
 *                 return false;
 *             }
 *             i++;
 *             j--;
 *         }
 *         return true;
 *     }
 * }
 *
 * 2、改进正则表达式匹配速度慢
 * class Solution {
 *     public boolean isPalindrome(String s) {
 *         if (s.isEmpty()) {return true;}
 *         int head = 0;
 *         int tail = s.length() - 1;
 *         char cHead, cTail;
 *         while (head <= tail) {
 *             cHead = s.charAt(head);
 *             cTail = s.charAt(tail);
 *             if (!Character.isLetterOrDigit(cHead)) {
 *                 head++;
 *             }else if (!Character.isLetterOrDigit(cTail)) {
 *                 tail--;
 *             } else {
 *                 if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
 *                     return false;
 *                 }
 *                 head++;
 *                 tail--;
 *             }
 *         }
 *         return true;
 *     }
 * }
 * */

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public boolean isPalindrome(String s) {
//        if (s.isEmpty()) {return true;}
//        int head = 0;
//        int tail = s.length() - 1;
//        char cHead, cTail;
//        while (head <= tail) {
//            cHead = s.charAt(head);
//            cTail = s.charAt(tail);
//            if (!Character.isLetterOrDigit(cHead)) {
//                head++;
//            }else if (!Character.isLetterOrDigit(cTail)) {
//                tail--;
//            } else {
//                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
//                    return false;
//                }
//                head++;
//                tail--;
//            }
//        }
//        return true;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
