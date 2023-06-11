package DataStructures.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array = new int[6];
        int length = 0;

        // Inserting
        for (int i = 0; i < 3; i++) {
           array[length] = i;
           length++;
        }

        // Insert At End
        array[length] = 15;

        // Insert at Start
        for(int i = 3; i>=0; i--) {
            array[i+1] = array[i];
        }
        array[0] = 20;

        // Insert at any Index - ex: 2
        for (int i = 4; i >= 2; i--) {
            array[i+1] = array[i];
        }
        array[2] = 17;

        // Printing
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
