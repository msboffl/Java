package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        // Methods
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);

        System.out.println(arr3); // [1, 2, 3]

        arr3.add(1, 4);
        arr3.add(2, 5);
        System.out.println(arr3); // [1, 4, 5, 2, 3]

        System.out.println(arr3.size()); // 5

        System.out.println(arr3.contains(2)); // true
        System.out.println(arr3.contains(6)); // false

        System.out.println(arr3.isEmpty()); // false
        ArrayList<Integer> arr4 = new ArrayList<>();
        System.out.println(arr4.isEmpty());  // true

        arr3.set(2, 6);
        arr3.set(4, 10);
        System.out.println(arr3);  // [1, 4, 6, 2, 10]

        arr3.remove(4);
        System.out.println(arr3); // [1, 4, 6, 2]

        System.out.println(arr3.clone()); // [1, 4, 6, 2]

        Collections.sort(arr3);
        System.out.println(arr3);

        arr3.removeAll(arr3);
        System.out.println(arr3); // []
    }
}
