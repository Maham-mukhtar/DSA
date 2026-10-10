import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] array = new int[10][10];

        int rows, columns;
        int choice;

        System.out.print("Enter number of rows: ");
        rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        columns = input.nextInt();

        do {

            System.out.println("\n----- 2D ARRAY MENU -----");
            System.out.println("1. Enter values");
            System.out.println("2. Display array");
            System.out.println("3. Search value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter array values:");

                    for (int i = 0; i < rows; i++) {

                        for (int j = 0; j < columns; j++) {

                            System.out.print("Enter value [" + i + "][" + j + "]: ");
                            array[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Values stored successfully.");
                    break;

                case 2:

                    System.out.println("2D Array:");

                    for (int i = 0; i < rows; i++) {

                        for (int j = 0; j < columns; j++) {

                            System.out.print(array[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.print("Enter value to search: ");
                    int search = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < rows; i++) {

                        for (int j = 0; j < columns; j++) {

                            if (array[i][j] == search) {

                                System.out.println(
                                    "Value found at [" + i + "][" + j + "]"
                                );

                                found = true;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Value not found.");
                    }

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

