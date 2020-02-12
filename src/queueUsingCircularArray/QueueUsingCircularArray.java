package queueUsingCircularArray;

import java.util.Scanner;

public class QueueUsingCircularArray {
    private int[] myQueue;
    private int beginning;
    private int top;
    private boolean isQueueCreated;

    public void createQueue() throws NumberFormatException {
        if (isQueueCreated) {
            System.out.println("Queue already created. Delete queue to create new");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = Integer.parseInt(scanner.nextLine().trim());
        if (size <= 0) {
            System.out.println("Size should be greater tha zero");
            return;
        }
        myQueue = new int[size];
        beginning = -1;
        top = -1;
        isQueueCreated = true;
        System.out.println("Queue of size " + size + " created.");

    }

    public void deleteQueue() {
        if (!isQueueCreated) {
            System.out.println("Create a queue first");
        } else {
            myQueue = null;
            isQueueCreated = false;
            System.out.println("Queue deleted");
        }

    }

    //helper method
    public boolean isFull() {
        return (beginning == 0 && top == myQueue.length - 1) || top == beginning - 1;
    }

    //helper method
    public boolean isEmpty() {
        return top == -1;
    }

    public void enqueue() throws NumberFormatException {
        if (!isQueueCreated) {
            System.out.println("Create a queue first");
            return;
        }
        if (isFull()) {
            System.out.println("Queue is full - Overflow");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element");
        int element = Integer.parseInt(scanner.nextLine().trim());
        scanner.close();

        if (beginning == -1) {
            beginning++;
        }
        top++;
        if (top == myQueue.length) {
            top = 0;
        }
        myQueue[top] = element;
        System.out.println("Element inserted at index " + top);
    }

    public void dequeue() {
        if (!isQueueCreated) {
            System.out.println("Create a queue first");
            return;
        }
        if (isEmpty()) {
            System.out.println("Queue is empty - Underflow");
            return;
        }
        if (beginning == myQueue.length) {
            beginning = 0;
        }
        beginning++;

        System.out.println("Element deleted from index " + (beginning - 1));
        if (beginning == top + 1) {
            beginning = -1;
            top = -1;
        }


    }


    public void display() {
        if (!isQueueCreated) {
            System.out.println("Create a queue first");
            return;
        }
        if (isEmpty()) {
            System.out.println("Queue is empty - Underflow");
            return;
        }
        if (top < beginning) {
            for (int i = beginning; i <= top + myQueue.length; i++) {
                System.out.print(myQueue[i % (myQueue.length)] + " ");

            }
            System.out.println();
        } else {
            for (int i = beginning; i <= top; i++) {
                System.out.print(myQueue[i] + " ");
            }
            System.out.println();
        }
    }

    public void peekInQueue() {
        if (!isQueueCreated) {
            System.out.println("Create a queue first");
            return;
        }
        if (isEmpty()) {
            System.out.println("Queue is empty - Underflow");
            return;
        }
        System.out.println(myQueue[beginning]);
    }

    public void printMenu() {
        System.out.println("press\n" +
                "0 - to exit\n" +
                "1 - to create queue\n" +
                "2 - to insert element\n" +
                "3 - to delete element\n" +
                "4 - to peek in queue\n" +
                "5 - to display queue\n" +
                "6 - to delete queue\n" +
                "7 - to print menu");
    }


}
