package lab1;

public class Queue {
	 private int[] queue;
	    private int front, rear, size, capacity;

	    public Queue(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    public void enqueue(int value) {
	        if (size == capacity) {
	            System.out.println("Queue overflow!");
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queue[rear] = value;
	        size++;
	        System.out.println("Enqueued " + value + " into queue.");
	    }

	    public void dequeue() {
	        if (size == 0) {
	            System.out.println("Queue underflow!");
	            return;
	        }
	        int val = queue[front];
	        front = (front + 1) % capacity;
	        size--;
	        System.out.println("Dequeued: " + val);
	    }

	    public void display() {
	        if (size == 0) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Queue contents: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(queue[(front + i) % capacity] + " ");
	        }
	        System.out.println();
	    }
	}

	



