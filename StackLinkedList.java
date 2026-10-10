import java.util.Scanner;
public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    // Push
    static void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    // Pop
    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Display
    static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;

            System.out.println("Stack:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STACK USING LINKED LIST -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}

