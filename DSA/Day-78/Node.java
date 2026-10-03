public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node removeNthNodeFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers until first reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original List:");
        printList(first);

        int n = 2;
        first = removeNthNodeFromEnd(first, n);

        System.out.println("List after removing " + n + "th node from end:");
        printList(first);
    }
}
