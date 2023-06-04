package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);

        dq.offerFirst(50);
        dq.offerFirst(60);

        System.out.println(dq);
    }
}
