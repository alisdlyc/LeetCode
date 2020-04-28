

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 1、将字符入栈
 * 2、若第一个字符为右括号返回false
 * 3、给栈底元素匹配，直到找到对应的右括号
 * 4、遍历所有的字符，若最后栈为空则返回true,否则为false\
 *
 *
 *
 *
 * class Solution {
 *     public boolean isValid(String s) {
 *         if ("".equals(s)) {
 *             return true;
 *         }
 *         if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
 *             return false;
 *         }
 *         Deque<Character> stack = new LinkedList<Character>();
 *         for (char c : s.toCharArray()) {
 *             if (c == '(') {
 *                 stack.push(')');
 *             } else if (c == '{') {
 *                 stack.push('}');
 *             } else if (c == '[') {
 *                 stack.push(']');
 *             }else if (stack.isEmpty() || stack.pop() != c) {
 *                 return false;
 *             }
 *         }
 *         return stack.isEmpty();
 *     }
 * }
 * */

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    private HashMap<Character,Character> map;
//    public Solution() {
//        this.map = new HashMap<Character, Character>();
//        this.map.put(')','(');
//        this.map.put(']','[');
//        this.map.put('}','{');
//    }
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        if ("".equals(s)) {
//            return true;
//        }
//        if (map.containsKey(s.charAt(0))) {
//            return false;
//        }
//        for (char c : s.toCharArray()) {
//            if (this.map.containsKey(c)){
//                char topElement = stack.empty() ? '#' : stack.pop();
//
//                if (topElement != this.map.get(c)) {
//                    return false;
//                }
//            } else {
//                stack.push(c);
//            }
//        }
//        return stack.isEmpty();
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
