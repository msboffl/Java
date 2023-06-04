package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80));

        ll1.add(10);
        ll1.add(0, 5);
        ll1.addAll(ll2);

        System.out.println(ll1.contains(25));
        System.out.println(ll1.get(3));
        System.out.println(ll1);
    }
}
