package gfgProblems;
public class ReverseString {
    public static String reverseStr(String str) {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        String str = "Mareedu Saibabu";
        String reversedStr = reverseStr(str);
        System.out.println(reversedStr);
    }
}
