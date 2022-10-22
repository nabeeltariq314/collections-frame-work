package Queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args){

        //It uses min-heap

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(7);
        pq.offer(3);
        pq.offer(10);
        pq.offer(1);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());



    }
}
