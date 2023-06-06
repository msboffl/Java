package DataStructures.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] squareNumbers = new int[10];
        for (int  i = 0; i < 10; i++) {
            int square = (i+1) * (i+1);
            squareNumbers[i] = square;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(squareNumbers[i]);
        }
        for(int square: squareNumbers) {
            System.out.println(square);
        }
    }
}
