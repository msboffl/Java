package codingNinjasPractice;

public class Addition {
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("Sum of a + b is: " + c);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add();
    }
}
