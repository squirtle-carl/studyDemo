package advanced.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("b");
        queue.offer("c");
        queue.offer("a");
        System.out.println(queue);
        for (String s : queue){
            System.out.println(s);
        }

        Deque<String> deque = new ArrayDeque<>();
        deque.offer("b");
        deque.offer("c");
        deque.offer("a");
        System.out.println(deque);
    }
}
