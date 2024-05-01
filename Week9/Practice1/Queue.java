import java.util.Scanner;

public class Queue {
    private int[] elements;
    private int size;

    // Construct a queue with the default capacity 8
    public Queue() {
        elements = new int[8];
    }

    public void enqueue(int value) {
        elements[size] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int result = elements[0];
        // Shift all elements to the left by one position
        System.arraycopy(elements, 1, elements, 0, size - 1);
        elements[--size] = 0; // Optional: Clear the last element
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();

        System.out.print("Input Numbers : ");

        String nums = input.nextLine();
        String[] nums_list = nums.split(" ");

        for(int i = 0; i < nums_list.length; i++) {
            int num = Integer.parseInt(nums_list[i]);
            queue.enqueue(num);
        }

        System.out.print("dequeue 3 elements : ");
        for(int i = 0; i < 3; i++) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

        System.out.println("current length : " + queue.getSize());

        System.out.println("dequeueing the rest of the queue...");

        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }

        input.close();
    }
}