class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // 1. Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Separate the second half
        ListNode second = slow.next;
        slow.next = null;

        // 3. Reverse the second half
        ListNode previous = null;

        while (second != null) {
            ListNode next = second.next;
            second.next = previous;
            previous = second;
            second = next;
        }

        // 4. Merge the two halves
        ListNode left = head;
        ListNode right = previous;

        while (right != null) {
            ListNode nextLeft = left.next;
            ListNode nextRight = right.next;

            left.next = right;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
}