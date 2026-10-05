// ==========================================================
// 234. Palindrome Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 100%)
// Memory     : 94.1 MB (Beats 89%)
// Link       : https://leetcode.com/problems/palindrome-linked-list/
// ==========================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previous = null;

        while(slow != null) {
            ListNode next = slow.next;
            slow.next = previous;
            previous = slow;
            slow = next;
        }    

        ListNode left = head;
        ListNode right = previous;

        while(right != null) {
            if(left.val == right.val) {
                left = left.next;
                right = right.next;
            }
            else {
                return false;
            }
            
        }
        
        return true;
    }
}