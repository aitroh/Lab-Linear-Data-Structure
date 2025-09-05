package lab1;

public class CircularLinkedList {
	class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head = null, tail = null;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        System.out.println("Inserted " + value + " into circular list.");
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            System.out.println("Deleted: " + head.data);
            head = tail = null;
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular list is empty.");
            return;
        }
        System.out.print("Circular List contents: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}



