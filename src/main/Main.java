package main;

import queueUsingCircularArray.QueueUsingCircularArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingCircularArray queue = new QueueUsingCircularArray();
        int choice = -1;
        queue.printMenu();
        while (choice != 0) {
            System.out.println("Enter choice");
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
                continue;
            }
            switch (choice) {
                case 0:
                    break;
                case 1:
                    try {
                        queue.createQueue();
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    try {
                        queue.enqueue();
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    queue.dequeue();
                    break;
                case 4:
                    queue.peekInQueue();
                    break;
                case 5:
                    queue.display();
                    break;
                case 6:
                    queue.deleteQueue();
                    break;
                case 7:
                    queue.printMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

}
