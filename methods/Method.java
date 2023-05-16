package methods;

public class Method {
    public static int maxValue(int x, int y) {
        if(x > y) {
            return x;
        } else return y;
    }

    public static int sumValue(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int maximum = maxValue(a, b);
        int sum = sumValue(a, b);

        System.out.println(maximum);
        System.out.println(sum);


    }
}
