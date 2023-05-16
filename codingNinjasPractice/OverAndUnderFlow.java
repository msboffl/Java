package codingNinjasPractice;

public class OverAndUnderFlow {
    public static void main(String[] args) {
        int overflow = Integer.MAX_VALUE; // or 2147483647
        System.out.println("Overflow is: " + (overflow + 1));

        int underflow = Integer.MIN_VALUE; // or -2147483648
        System.out.println("Underflow is: " + (underflow - 1));
    }
}
