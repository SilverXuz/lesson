import java.util.*;

/**
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк
 * и выводит на консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов, помещает их в
 * очередь и выводит на консоль содержимое очереди.
 */
public class FinalTask {

    public static void printStack() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println("Stack: " + stack);
        System.out.println("Peek (смотрим верхушку): " + stack.peek());
    }

    public static void printQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println("Queue: " + queue);
        System.out.println("Peek (смотрим верхушку): " + queue.peek());
    }

}
