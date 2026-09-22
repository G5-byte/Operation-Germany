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

    public static Node deleteAtBeginning(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    public static Node deleteAtEnd(Node head) {
         if(head == null) {
            return null;
        }
        
        if(head.next == null) {
            return null;
        }

        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        return head;
    }

    public static Node deleteAtPosition(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position <= 1) {
            return deleteAtBeginning(head);
        }

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null || current.next == null) {
            return deleteAtEnd(head);
        }

        current.next = current.next.next;
        return head;
    }

    public static int getLength(Node head) {
        int count = 0;

        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    public static int search(Node head, int target){
        Node current = head;
        int position = 1;
        while (current != null) {
            if(current.data == target){
                return position;
            }
            position++;
            current = current.next;
        }

        return -1;
    }

     static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
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
        first = deleteAtBeginning(first);
        first = deleteAtEnd(first);
        first = deleteAtPosition(first, 2);
        printList(first);
        System.out.println();
        System.out.println("Length : " + getLength(first));
        System.out.println("Found at Position : " + search(first, 30));
    }
}