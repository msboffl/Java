package DataStructures.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] array = new int[10];

        int length = 0;
        for(int i = 0; i < 6; i++) {
            array[length] = i;
            length++;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
