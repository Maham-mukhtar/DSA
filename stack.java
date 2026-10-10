import java.util.Scanner;
public class stack {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] stack = new int[10];
        int top = -1;
        int choice;
        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            switch (choice) {

                case 1:
                    // Push: add value on top
                    if (top == 9) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        top++;
                        stack[top] = value;

                        System.out.println("Value pushed successfully.");
                    }
                    break;

                case 2:
                    // Pop: remove value from top
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Popped value: " + stack[top]);
                        top--;
                    }
                    break;

                case 3:
                    // Display stack
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack values:");

                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 4:
                    // Size of stack
                    System.out.println("Stack size = " + (top + 1));
                    break;

                case 5:
                    // Check if stack is empty
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6:
                    // Check if stack is full
                    if (top == 9) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;

                case 7:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        input.close();
    }
}

