//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划
/**
 * f(n) = f(n-1) + f(n-2)
 * + 要走到第n层，可以从第n-1层爬一步，或者从第n-2层爬两步
 * class Solution {
 *     public int climbStairs(int n) {
 *         if(n <= 0 || n == 1 || n == 2) return n;
 *
 *         int last = 0;
 *         int cur = 1;
 *         int re = 0;
 *
 *         for (int i = 0; i < n; i++) {
 *             re = last + cur;
 *             last = cur;
 *             cur = re;
 *         }
 *         return re;
 *     }
 * }
 *
 *
 * 2、将计算结果用一个数组存储起来
 *
 * class Solution {
 *     public int climbStairs(int n) {
 *         if(n <= 0 || n == 1 || n == 2) {
 *             return n;
 *         }
 *         int[] men = new int[n];
 *         men[0] = 1;
 *         men[1] = 2;
 *
 *         for (int i = 2; i < n; i++){
 *             men[i] = men[i-1] + men[i-2];
 *         }
 *         return men[n-1];
 *     }
 * }
 * */

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int climbStairs(int n) {
//        if(n <= 0 || n == 1 || n == 2) {
//            return n;
//        }
//        int[] men = new int[n];
//        men[0] = 1;
//        men[1] = 2;
//
//        for (int i = 2; i < n; i++){
//            men[i] = men[i-1] + men[i-2];
//        }
//        return men[n-1];
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
