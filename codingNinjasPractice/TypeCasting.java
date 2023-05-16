package codingNinjasPractice;

public class TypeCasting {
    public static void main(String[] args) {
        // Automatically Converted
        int i = 2147483647;
        long l = i;
        l = l + 1;
        System.out.println(l);

        double d = l;
        System.out.println(d);

        // Explicitly
        double dd = 25.134;
        int ii = (int) dd;
        System.out.println(ii);

        byte b = (byte) ii;
        System.out.println(b);

    }
}
