//给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。 
//
// 求在该柱状图中，能够勾勒出来的矩形的最大面积。 
//
// 
//
// 
//
// 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。 
//
// 
//
// 
//
// 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。 
//
// 
//
// 示例: 
//
// 输入: [2,1,5,6,2,3]
//输出: 10 
// Related Topics 栈 数组

import java.util.Stack;

/**
 * 1、使用一个栈存入元素
 * 2、若入栈元素小于栈顶元素，则说明当前元素值为栈顶元素的右边界
 * 3、栈的左边结为栈顶元素的下一个元素
 *
 *  一、暴力解法
 *  class Solution {
 *     public int largestRectangleArea(int[] heights) {
 *         int maxarea = 0;
 *         for (int i = 0; i < heights.length; i++) {
 *             for (int j = i; j < heights.length; j++) {
 *                 int minheight = Integer.MAX_VALUE;
 *                 for (int k = i; k <= j; k++)
 *                     minheight = Math.min(minheight, heights[k]);
 *                 maxarea = Math.max(maxarea, minheight * (j - i + 1));
 *             }
 *         }
 *         return maxarea;
 *     }
 * }
 *
 *
 * 二、优化的暴力
 * class Solution {
 *     public int largestRectangleArea(int[] heights) {
 *         int maxarea = 0;
 *         for (int i = 0; i < heights.length; i++) {
 *             int minheight = Integer.MAX_VALUE;
 *             for (int j = i; j < heights.length; j++) {
 *                 minheight = Math.min(minheight, heights[j]);
 *                 maxarea = Math.max(maxarea, minheight * (j - i + 1));
 *             }
 *         }
 *         return maxarea;
 *     }
 * }
 *
 * 三、维护一个栈
 * class Solution {
 *     public int largestRectangleArea(int[] heights) {
 *         Stack<Integer> stack = new Stack<>();
 *         stack.push(-1);
 *         int maxarea = 0;
 *
 *         for (int i = 0; i < heights.length; i++) {
 *             while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
 *                 maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
 *             }
 *
 *             stack.push(i);
 *         }
 *         //当 i 为 length 后， i 的值变为 height.length()
 *         while (stack.peek() != -1) {
 *             maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() -1));
 *         }
 *
 *         return maxarea;
 *     }
 * }
 *
 * 四、对每一个 height[i] 找到他的左右边界
 * class Solution {
 *     public static int largestRectangleArea(int[] height) {
 *         if (height == null || height.length == 0) {
 *             return 0;
 *         }
 *         int[] lessFromLeft = new int[height.length];
 *         // idx of the first bar the left that is lower than current
 *         int[] lessFromRight = new int[height.length];
 *         // idx of the first bar the right that is lower than current
 *         lessFromRight[height.length - 1] = height.length;
 *         lessFromLeft[0] = -1;
 *
 *         for (int i = 1; i < height.length; i++) {
 *             int p = i - 1;
 *
 *             while (p >= 0 && height[p] >= height[i]) {
 *                 p = lessFromLeft[p];
 *             }
 *             lessFromLeft[i] = p;
 *         }
 *
 *         for (int i = height.length - 2; i >= 0; i--) {
 *             int p = i + 1;
 *
 *             while (p < height.length && height[p] >= height[i]) {
 *                 p = lessFromRight[p];
 *             }
 *             lessFromRight[i] = p;
 *         }
 *
 *         int maxArea = 0;
 *         for (int i = 0; i < height.length; i++) {
 *             maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
 *         }
 *
 *         return maxArea;
 *     }
 * }
 * */
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static int largestRectangleArea(int[] height) {
//        if (height == null || height.length == 0) {
//            return 0;
//        }
//        int[] lessFromLeft = new int[height.length];
//        // idx of the first bar the left that is lower than current
//        int[] lessFromRight = new int[height.length];
//        // idx of the first bar the right that is lower than current
//        lessFromRight[height.length - 1] = height.length;
//        lessFromLeft[0] = -1;
//
//        for (int i = 1; i < height.length; i++) {
//            int p = i - 1;
//
//            while (p >= 0 && height[p] >= height[i]) {
//                p = lessFromLeft[p];
//            }
//            lessFromLeft[i] = p;
//        }
//
//        for (int i = height.length - 2; i >= 0; i--) {
//            int p = i + 1;
//
//            while (p < height.length && height[p] >= height[i]) {
//                p = lessFromRight[p];
//            }
//            lessFromRight[i] = p;
//        }
//
//        int maxArea = 0;
//        for (int i = 0; i < height.length; i++) {
//            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
//        }
//
//        return maxArea;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
