package operators;

public class Unary {
    public static void main(String[] args) {
        // 1. Unary (-) Operator
        int num1 = 300;
        num1 = -num1;
        System.out.println(num1);

        int num2 = -300;
        num2 = -num2;
        System.out.println(num2);

        // 2. Unary (!) Operator
        int a = 10;
        int b = 20;
        System.out.println(a < b);
        System.out.println(!(a < b));
    }
}
