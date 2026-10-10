import java.util.Scanner;
public class CircularQueue {
    static int[] queue = new int[5];

    static int front = -1;
    static int rear = -1;

    // Enqueue
    static void enqueue(int value) {

        // Check if queue is full
        if ((rear + 1) % queue.length == front) {
            System.out.println("Circular Queue is full.");
            return;
        }

        // First value
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = value;

        System.out.println(value + " added to circular queue.");
    }

    // Dequeue
    static void dequeue() {

        if (front == -1) {
            System.out.println("Circular Queue is empty.");
            return;
        }

        System.out.println(queue[front] + " removed from queue.");

        // Only one value was present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Display
    static void display() {

        if (front == -1) {
            System.out.println("Circular Queue is empty.");
            return;
        }

        System.out.println("Circular Queue:");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- CIRCULAR QUEUE -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
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

