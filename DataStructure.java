package lab1;
import java.util.*;

public class DataStructure {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    Stack stack = new Stack(10);
                    while (true) {
                        System.out.println("\n--- Stack Operations ---");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Display");
                        System.out.println("4. Back");
                        System.out.print("Enter choice: ");
                        int ch = scan.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter value to push: ");
                            stack.push(scan.nextInt());
                        } else if (ch == 2) {
                            stack.pop();
                        } else if (ch == 3) {
                            stack.display();
                        } else break;
                    }
                }
                case 2 -> {
                    Queue queue = new Queue(10);
                    while (true) {
                        System.out.println("\n--- Queue Operations ---");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Display");
                        System.out.println("4. Back");
                        System.out.print("Enter choice: ");
                        int ch = scan.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter value to enqueue: ");
                            queue.enqueue(scan.nextInt());
                        } else if (ch == 2) {
                            queue.dequeue();
                        } else if (ch == 3) {
                            queue.display();
                        } else break;
                    }
                }
                case 3 -> {
                    LinkedList list = new LinkedList();
                    while (true) {
                        System.out.println("\n--- Linked List Operations ---");
                        System.out.println("1. Insert at end");
                        System.out.println("2. Delete at beginning");
                        System.out.println("3. Display");
                        System.out.println("4. Back");
                        System.out.print("Enter choice: ");
                        int ch = scan.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter value to insert: ");
                            list.insertAtEnd(scan.nextInt());
                        } else if (ch == 2) {
                            list.deleteAtBeginning();
                        } else if (ch == 3) {
                            list.display();
                        } else break;
                    }
                }
                case 4 -> {
                    CircularLinkedList cll = new CircularLinkedList();
                    while (true) {
                        System.out.println("\n--- Circular Linked List Operations ---");
                        System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Display");
                        System.out.println("4. Back");
                        System.out.print("Enter choice: ");
                        int ch = scan.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter value to insert: ");
                            cll.insert(scan.nextInt());
                        } else if (ch == 2) {
                            cll.delete();
                        } else if (ch == 3) {
                            cll.display();
                        } else break;
                    }
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
