package polymorphism;

class MethodOverLoadingExample {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int multiply(int num1, int num2, int num3) {
        return num1 * num2 *num3;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoadingExample obj = new MethodOverLoadingExample();
        int productOfTwo = obj.multiply(2, 5);
        int productOfThree = obj.multiply(2, 3, 4);

        System.out.println(productOfTwo);
        System.out.println(productOfThree);

    }
}
