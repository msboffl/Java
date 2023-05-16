package methods;

public class MethodOverLoading {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int sumofTwo = MethodOverLoading.sum(10, 20);
        int sumofThree = MethodOverLoading.sum(10, 20, 30);

        System.out.println(sumofTwo);
        System.out.println(sumofThree);
    }
}
