package lab1;

public class Stack {

	

	private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack overflow!");
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " into stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}