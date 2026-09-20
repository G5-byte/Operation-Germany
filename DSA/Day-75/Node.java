public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (head == null || position <= 1) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            return insertAtEnd(head, data);
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
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
        fifth.next = null;

        first = insertAtBeginning(first, 5);
        first = insertAtPosition(first, 25, 4);
        first = insertAtEnd(first, 60);
        printList(first);
    }
}