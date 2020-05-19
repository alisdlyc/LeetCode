package com.alisdlyc.leetcode.editor.cn;

import java.util.*;
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针

/**
 * 1、暴力解题，三重循环解决
 *  + 使用 Set定义的 LinkedHashSet 可以去除重复的元素，但是时间复杂度为O(n^3),运行超时
 *  class Solution {
 *     public List<List<Integer>> threeSum(int[] nums) {
 *         if (nums == null || nums.length <= 2) {
 *             return Collections.emptyList();
 *         }
 *         Set<List<Integer>> re = new LinkedHashSet<>();
 *         Arrays.sort(nums);
 *         for (int i = 0; i < nums.length - 2; i++) {
 *             for (int j = i + 1; j < nums.length - 1; j++) {
 *                 for (int k = j + 1; k < nums.length; k++) {
 *                     if (nums[i] + nums[j] + nums[k] == 0) {
 *                         re.add(Arrays.asList(nums[i], nums[j], nums[k]));
 *                     }
 *                 }
 *             }
 *         }
 *         return new ArrayList<>(re);
 *     }
 * }
 *
 *
 * class Solution {
 *     public List<List<Integer>> threeSum(int[] nums) {
 *         List<List<Integer>> re = new ArrayList<>();
 *
 *         int len = nums.length;
 *         if (len < 3 || nums == null) {
 *             return re;
 *         }
 *         Arrays.sort(nums);
 *         for (int i = 0; i < len; i++) {
 *             if (nums[i] > 0) {
 *                 break;
 *             }
 *             if (i > 0 && nums[i] == nums[i - 1]) {
 *                 continue;
 *             }
 *             int L = i + 1;
 *             int R = len - 1;
 *             while (L < R) {
 *                 int sum = nums[i] + nums[L] + nums[R];
 *                 if (sum < 0) {
 *                     L++;
 *                 }else if (sum > 0) {
 *                     R--;
 *                 }else {
 *                     re.add(Arrays.asList(nums[i],nums[L],nums[R]));
 *                     while (L < R && nums[L] == nums[L + 1]) {
 *                         L++;
 *                     }
 *                     while (L < R && nums[R] == nums[R - 1]) {
 *                         R--;
 *                     }
 *                     L++;
 *                     R--;
 *                 }
 *             }
 *         }
 *         return re;
 *     }
 * }
 *
 * */


//leetcode submit region begin(Prohibit modification and deletion)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> re = new ArrayList<>();
//
//         int len = nums.length;
//         if (len < 3 ) {
//             return re;
//         }
//         Arrays.sort(nums);
//         for (int i = 0; i < len; i++) {
//             if (nums[i] > 0) {
//                 break;
//             }
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }
//             int L = i + 1;
//             int R = len - 1;
//             while (L < R) {
//                 int sum = nums[i] + nums[L] + nums[R];
//                 if (sum < 0) {
//                     L++;
//                 }else if (sum > 0) {
//                     R--;
//                 }else {
//                     re.add(Arrays.asList(nums[i],nums[L],nums[R]));
//                     while (L < R && nums[L] == nums[L + 1]) {
//                         L++;
//                     }
//                     while (L < R && nums[R] == nums[R - 1]) {
//                         R--;
//                     }
//                     L++;
//                     R--;
//                 }
//             }
//         }
//         return re;
//     }
// }
//leetcode submit region end(Prohibit modification and deletion)
