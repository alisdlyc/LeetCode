//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法


/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private List<String> re;
    public List<String> generateParenthesis(int n) {
        re = new ArrayList<String>();
        recur(0, 0, n, "");
        return re;
    }

    private void recur(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n) {
            System.out.println(s);
            re.add(s);
            return;
        }

        // left 可以随便添加，只要值小于 n
        // right 之前必须有左括号， 且左括号个数要大于右括号的个数
        // 在生成括号的时候就判断其合法性

        // process : current logic : left &&  right

        // drill down
        if (left < n) {
            recur(left + 1, right, n, s + "(");
        }

        if (left > right) {
            recur(left, right + 1, n, s + ")");
        }

        // reverse states
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
*/
