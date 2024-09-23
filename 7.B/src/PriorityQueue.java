import java.util.Arrays;
import java.util.Comparator;
class PriorityQueue<T> {
    private T[] queue;
    private Comparator<? super T> comparator;
    private int size;
    private int capacity;
    @SuppressWarnings("unchecked")
    public PriorityQueue(int capacity, Comparator<? super T> comparator) {
        this.capacity = capacity;
        this.comparator = comparator;
        this.queue = (T[]) new Object[capacity];
        this.size = 0;
    }
    public void enqueue(T element) {
        if (size == capacity) {
            throw new RuntimeException("Priority Queue is full");
        }
        queue[size++] = element;
        reorder();
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Priority Queue is empty");
        }
        T highestPriorityElement = queue[0];
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[--size] = null;
        return highestPriorityElement;
    }
    private void reorder() {
        Arrays.sort(queue, 0, size, comparator);
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Priority Queue is empty");
        }
        return queue[0];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}
 class GenericPriorityQueueTest {
    public static void main(String[] args) {
        System.out.println("Testing PriorityQueue with Integer:");
        PriorityQueue<Integer> intPriorityQueue = new PriorityQueue<>(5, Comparator.reverseOrder());
        intPriorityQueue.enqueue(10);
        intPriorityQueue.enqueue(30);
        intPriorityQueue.enqueue(20);
        System.out.println("Peek: " + intPriorityQueue.peek());
        System.out.println("Dequeue: " + intPriorityQueue.dequeue());
        System.out.println("Peek after dequeue: " + intPriorityQueue.peek());
        System.out.println("\nTesting PriorityQueue with Double:");
        PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>(5, Comparator.naturalOrder());
        doublePriorityQueue.enqueue(10.5);
        doublePriorityQueue.enqueue(3.4);
        doublePriorityQueue.enqueue(7.8);
        System.out.println("Peek: " + doublePriorityQueue.peek());
        System.out.println("Dequeue: " + doublePriorityQueue.dequeue());
        System.out.println("Peek after dequeue: " + doublePriorityQueue.peek());
        System.out.println("\nTesting PriorityQueue with String:");
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(5, Comparator.naturalOrder());
        stringPriorityQueue.enqueue("Banana");
        stringPriorityQueue.enqueue("Apple");
        stringPriorityQueue.enqueue("Peach");
        System.out.println("Peek: " + stringPriorityQueue.peek());
        System.out.println("Dequeue: " + stringPriorityQueue.dequeue());
        System.out.println("Peek after dequeue: " + stringPriorityQueue.peek());
    }
}
