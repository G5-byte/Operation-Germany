// ==========================================================
// 83. Remove Duplicates from Sorted List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.5 MB (Beats 51%)
// Link       : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return null;
        }

        

        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
                
            }
            else {
                current = current.next;
            }

            
        }

        return head;
    }
}