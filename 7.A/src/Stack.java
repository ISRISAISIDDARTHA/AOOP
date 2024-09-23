interface Stack<T> {
    void push(T element);      
    T pop();                  
    T peek();                  
    boolean isEmpty();         
}
class Node<T> {
 T data;
 Node<T> next;
 Node(T data) {
     this.data = data;
     this.next = null;
 }
}
class LinkedListStack<T> implements Stack<T> {
 private Node<T> top;

 public LinkedListStack() {
     this.top = null;
 }
 @Override
 public void push(T element) {
     Node<T> newNode = new Node<>(element);
     newNode.next = top;
     top = newNode;
 }
 @Override
 public T pop() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     T data = top.data;
     top = top.next;
     return data;
 }
 @Override
 public T peek() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     return top.data;
 }
 @Override
 public boolean isEmpty() {
     return top == null;
 }
}
class ArrayStack<T> implements Stack<T> {
 private T[] array;
 private int top;
 private int capacity;

 @SuppressWarnings("unchecked")
 public ArrayStack(int capacity) {
     this.capacity = capacity;
     array = (T[]) new Object[capacity];
     top = -1;
 }
 @Override
 public void push(T element) {
     if (top == capacity - 1) {
         throw new RuntimeException("Stack overflow");
     }
     array[++top] = element;
 }
 @Override
 public T pop() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     return array[top--];
 }
 @Override
 public T peek() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     return array[top];
 }
 @Override
 public boolean isEmpty() {
     return top == -1;
 }
}
 class GenericStackTest {
    public static void main(String[] args) {
        System.out.println("Testing LinkedListStack with Integer:");
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("Top element: " + linkedListStack.peek());
        System.out.println("Popped element: " + linkedListStack.pop());
        System.out.println("Top element after pop: " + linkedListStack.peek());
        System.out.println("Is stack empty? " + linkedListStack.isEmpty());
        System.out.println("\nTesting ArrayStack with String:");
        Stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("Hello");
        arrayStack.push("World");
        System.out.println("Top element: " + arrayStack.peek());
        System.out.println("Popped element: " + arrayStack.pop());
        System.out.println("Top element after pop: " + arrayStack.peek());
        System.out.println("Is stack empty? " + arrayStack.isEmpty());
        System.out.println("\nTesting LinkedListStack with Character:");
        Stack<Character> charLinkedListStack = new LinkedListStack<>();
        charLinkedListStack.push('A');
        charLinkedListStack.push('B');
        charLinkedListStack.push('C');
        System.out.println("Top element: " + charLinkedListStack.peek());
        System.out.println("Popped element: " + charLinkedListStack.pop());
        System.out.println("Top element after pop: " + charLinkedListStack.peek());
        System.out.println("Is stack empty? " + charLinkedListStack.isEmpty());
    }
}
