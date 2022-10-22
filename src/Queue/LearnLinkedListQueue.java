package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){

//        Queue<Integer> queue = new LinkedList<>();
////
////        queue.offer(12);
////        queue.offer(16);
////        queue.offer(2);
////        queue.offer(47);
////
////        System.out.println(queue);
////
////        System.out.println(queue.poll());
////        System.out.println(queue);
////
////        System.out.println(queue.peek());

        Queue<String> queue = new LinkedList<>();

        queue.offer(" ");
        queue.offer("Good");

        System.out.println(queue);
    }
}
