 import java.util.Scanner;
public class queue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] queue = new int[10];

        int front = 0;
        int rear = -1;
        int size = 0;
        int choice;
        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    // Enqueue (Add value at rear)
                    if (size == 10) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.print("Enter token number: ");
                        int value = input.nextInt();

                        rear++;
                        queue[rear] = value;
                        size++;

                        System.out.println("Value added successfully.");
                    }
                    break;

                case 2:
                    //Dequeue( Remove value from front)
                    if (size == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Removed value: " + queue[front]);

                        front++;
                        size--;

                        // Reset queue when it becomes empty
                        if (size == 0) {
                            front = 0;
                            rear = -1;
                        }
                    }
                    break;

                case 3:
                    // Display values
                    if (size == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue values:");

                        for (int i = front; i <= rear; i++) {
                            System.out.println(queue[i]);
                        }
                    }
                    break;

                case 4:
                    // Display size
                    System.out.println("Queue size = " + size);
                    break;

                case 5:
                    // Check if empty
                    if (size == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    // Check if full
                    if (size == 10) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
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

