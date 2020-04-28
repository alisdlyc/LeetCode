
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

import java.util.HashMap;
import java.util.Map;

/**
 * 1、暴力破解
 *  + 通过两重的循环，找出和为target的两个数字的下标
 *  +
 *  class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *         int[] re = new int[2];
 *         for (int i = 0; i < nums.length - 1; i++) {
 *             for (int j = i+1; j < nums.length; j++) {
 *                 if (nums[i] + nums[j] == target) {
 *                     re[0] = i;
 *                     re[1] = j;
 *                 }
 *             }
 *         }
 *         return re;
 *     }
 * }
 *
 * 2、由于只有一组解，可以设置退出条件
 * class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *         for (int i = 0; i < nums.length - 1; i++) {
 *             for (int j = i+1; j < nums.length; j++) {
 *                 if (nums[i] + nums[j] == target) {
 *                     return new int[] { i , j};
 *                 }
 *             }
 *         }
 *         return null;
 *     }
 * }
 *
 * 3、HashMap
 * class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *         Map<Integer, Integer> map = new HashMap<>();
 *         // 第一遍遍历将value 和 下标放入map中
 *         for (int i = 0; i < nums.length; i++) {
 *             map.put(nums[i], i);
 *         }
 *         // 第二遍遍历寻找 complement 且 complement的下标，找到时返回
 *         for (int i = 0; i < nums.length; i++) {
 *             int comp = target - nums[i];
 *             if (map.containsKey(comp) && map.get(comp) != i){
 *                 return new int[] {i, map.get(comp)};
 *             }
 *         }
 *         return null;
 *     }
 * }
 * */


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int comp = target - nums[i];
//            if (map.containsKey(comp) && map.get(comp) != i){
//                return new int[] {i, map.get(comp)};
//            }
//        }
//        return null;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
