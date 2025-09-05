package lab1;

public class LinkedList {
	 class Node {
	        int data;
	        Node next;
	        Node(int data) { this.data = data; }
	    }

	    private Node head;

	    public void insertAtEnd(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	            temp.next = newNode;
	        }
	        System.out.println("Inserted " + value + " at end.");
	    }

	    public void deleteAtBeginning() {
	        if (head == null) {
	            System.out.println("List is empty.");
	        } else {
	            System.out.println("Deleted: " + head.data);
	            head = head.next;
	        }
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        System.out.print("Linked List contents: ");
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}



