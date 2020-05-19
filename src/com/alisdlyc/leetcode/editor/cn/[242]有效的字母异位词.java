//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表

import java.util.Arrays;

/**
 * class Solution {
 *     public boolean isAnagram(String s, String t) {
 *         if (s.length() != t.length()) {
 *             return false;
 *         }
 *         int[] check = new int[26];
 *         int[] reCheck = new int[26];
 *         for (int i = 0; i < s.length(); i++) {
 *             check[s.charAt(i)- 'a'] += 1;
 *             reCheck[t.charAt(i) - 'a'] += 1;
 *         }
 *         for (int i = 0; i < check.length; i++) {
 *             if (check[i] != reCheck[i]) {
 *                 return false;
 *             }
 *         }
 *         return true;
 *     }
 * }
 *
 * class Solution {
 *     public boolean isAnagram(String s, String t) {
 *          if (s.length() != t.length()) {
 *              return false;
 *          }
 *          char[] strS = s.toCharArray();
 *          char[] strT = t.toCharArray();
 *          Arrays.sort(strS);
 *          Arrays.sort(strT);
 *          return Arrays.equals(strS, strT);
 *     }
 * }
 *
 * */

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         char[] strS = s.toCharArray();
//         char[] strT = t.toCharArray();
//         Arrays.sort(strS);
//         Arrays.sort(strT);
//         return Arrays.equals(strS, strT);
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
