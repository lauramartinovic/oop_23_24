package pckg_vj7;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class TestQueue {

    private static int processingFlag = 1;


    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        try{
            populateQueue(queue);
            System.out.println(queue);
            boolean processed = processQueueElement(queue);
            System.out.println(processed);
            addNewElementToQueue(-100, queue, processed);

        } catch (IllegalStateException ilse){
            System.out.println("Queue is full!");
        } finally {
            System.out.println(queue);
        }
    }

    private static ArrayBlockingQueue<Integer> populateQueue(int num){
        return null;
    }

    private static void populateQueue(ArrayBlockingQueue<Integer> queue){
        int populated = queue.size();
        int reminder = queue.remainingCapacity();
        int capacity = populated + reminder;
        System.out.println("Capacity is: " + capacity);

        for (int k = 0; k < capacity; k++){
            queue.add(ThreadLocalRandom.current().nextInt(100));
        }
    }

    private static boolean processQueueElement(ArrayBlockingQueue<Integer> queue){

        boolean processed = false;

        if( !queue.isEmpty() && processingFlag==1){

            Integer element = queue.poll(); //uklanja i vraca prvi element iz reda
            System.out.println("Processing element: " + element);
            System.out.println("Remaining elements in queue to process: " + queue.size());
            processed = true;
        } else {
            System.out.println("Queue is waiting or empty.");
        }

        return processed;
    }

    private static void addNewElementToQueue(Integer element, ArrayBlockingQueue<Integer> queue, boolean processed){
        if(processed){
            queue.add(element);
            System.out.println("New element added to a queue!");
            System.out.println(queue);
        } else {
            System.out.println("Unable to add new element to a queue!");
            System.out.println(queue);
        }
    }
}
