//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表

import java.util.List;

/**
 * 1、将两个有序链表合并为一个
 * 2、创建一个新的链表，采用双指针遍历 l1 和 l2,将两个链表合并为一个有序的链表
 *    返回 新的链表
 *烧脑的递归解法：
 *class Solution {
 *     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 *         if (l1 == null) {return l2;}
 *         if (l2 == null) {return l1;}
 *         if (l1.val < l2.val) {
 *             l1.next = mergeTwoLists(l1.next, l2);
 *             return l1;
 *         } else {
 *             l2.next = mergeTwoLists(l1, l2.next);
 *             return l2;
 *         }
 *     }
 *
 *     public static class ListNode {
 *         int val;
 *         ListNode next;
 *         ListNode(int x) { val = x; }
 *     }
 * }
 *
 * 3、易于理解，但是运训速度稍微缓慢
 * class Solution {
 *     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 *         if (l1 == null) {return l2;}
 *         if (l2 == null) {return l1;}
 *         ListNode headPtr = new ListNode(0);
 *         ListNode curPtr = headPtr;
 *         while (l1 != null && l2 != null) {
 *             if (l1.val < l2.val) {
 *                 curPtr.next = l1;
 *                 l1 = l1.next;
 *             } else {
 *                 curPtr.next = l2;
 *                 l2 = l2.next;
 *             }
 *             curPtr = curPtr.next;
 *         }
 *         curPtr.next = l1 == null ? l2 : l1;
 *         return headPtr.next;
 *     }
 *
 *     public static class ListNode {
 *         int val;
 *         ListNode next;
 *         ListNode(int x) { val = x; }
 *     }
 * }
 * */

//leetcode submit region begin(Prohibit modification and deletion)

//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {return l2;}
//        if (l2 == null) {return l1;}
//        ListNode headPtr = new ListNode(0);
//        ListNode curPtr = headPtr;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                curPtr.next = l1;
//                l1 = l1.next;
//            } else {
//                curPtr.next = l2;
//                l2 = l2.next;
//            }
//            curPtr = curPtr.next;
//        }
//        curPtr.next = l1 == null ? l2 : l1;
//        return headPtr.next;
//    }
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) { val = x; }
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
