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
}
