import java.util.Scanner;
public class QueueLinkedList {
    
        static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        static Node front = null;
        static Node rear = null;
    
        // Enqueue
        static void enqueue(int value) {
    
            Node newNode = new Node(value);
    
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
    
            System.out.println(value + " added to queue.");
        }
    
        // Dequeue
        static void dequeue() {
    
            if (front == null) {
                System.out.println("Queue is empty.");
            } else {
    
                System.out.println(front.data + " removed from queue.");
    
                front = front.next;
    
                if (front == null) {
                    rear = null;
                }
            }
        }
    
        // Display
        static void display() {
    
            if (front == null) {
                System.out.println("Queue is empty.");
            } else {
    
                Node temp = front;
    
                System.out.println("Queue:");
    
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
    
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            int choice;
    
            do {
    
                System.out.println("\n----- QUEUE USING LINKED LIST -----");
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
