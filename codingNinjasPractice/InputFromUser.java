package codingNinjasPractice;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // String
        sc.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

        System.out.println("Enter the String value: ");
        String str = sc.nextLine();

        int c =  a + b;


        System.out.println("Sum value of a + b is: " + c);
        System.out.println(str);

    }

}
