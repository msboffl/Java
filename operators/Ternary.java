package operators;

public class Ternary {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int minimum;

        minimum = (a < b) ? a : b;

        System.out.println(minimum);
    }
}
