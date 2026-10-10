import java.util.Scanner;
public class onedarray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size, choice;
        int i, pos, value, found;

        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        System.out.println("Enter array elements:");
        i = 0;
        while (i < size) {
            arr[i] = sc.nextInt();
            i++;
        }

        choice = 0;

        while (choice != 7) {
            System.out.println("\n--- 1D ARRAY MENU ---");
            System.out.println("1. Traversal");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Searching");
            System.out.println("5. Sorting");
            System.out.println("6. Updation");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Array elements:");
                i = 0;
                while (i < size) {
                    System.out.print(arr[i] + " ");
                    i++;
                }
                System.out.println();
            }

            else if (choice == 2) {
                if (size == 100) {
                    System.out.println("Array is full.");
                } else {
                    System.out.print("Enter position (1 to "
                            + (size + 1) + "): ");
                    pos = sc.nextInt();

                    if (pos < 1 || pos > size + 1) {
                        System.out.println("Invalid position.");
                    } else {
                        System.out.print("Enter value: ");
                        value = sc.nextInt();

                        i = size;
                        while (i >= pos) {
                            arr[i] = arr[i - 1];
                            i--;
                        }

                        arr[pos - 1] = value;
                        size++;

                        System.out.println("Element inserted.");
                    }
                }
            }

            else if (choice == 3) {
                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {
                    System.out.print("Enter position to delete (1 to "
                            + size + "): ");
                    pos = sc.nextInt();

                    if (pos < 1 || pos > size) {
                        System.out.println("Invalid position.");
                    } else {
                        i = pos - 1;

                        while (i < size - 1) {
                            arr[i] = arr[i + 1];
                            i++;
                        }

                        size--;
                        System.out.println("Element deleted.");
                    }
                }
            }

            else if (choice == 4) {
                System.out.print("Enter value to search: ");
                value = sc.nextInt();

                i = 0;
                found = -1;

                while (i < size) {
                    if (arr[i] == value) {
                        found = i;
                        break;
                    }
                    i++;
                }

                if (found != -1) {
                    System.out.println("Element found at position "
                            + (found + 1));
                } else {
                    System.out.println("Element not found.");
                }
            }

            else if (choice == 5) {
                i = 0;

                while (i < size - 1) {
                    int j = 0;

                    while (j < size - i - 1) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                        j++;
                    }
                    i++;
                }

                System.out.println("Array sorted in ascending order.");
            }

            else if (choice == 6) {
                System.out.print("Enter position to update (1 to "
                        + size + "): ");
                pos = sc.nextInt();

                if (pos < 1 || pos > size) {
                    System.out.println("Invalid position.");
                } else {
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    arr[pos - 1] = value;
                    System.out.println("Element updated.");
                }
            }

            else if (choice == 7) {
                System.out.println("Program ended.");
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
