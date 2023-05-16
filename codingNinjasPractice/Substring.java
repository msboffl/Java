package codingNinjasPractice;

public class Substring {
    public static void main(String[] args) {
        String word = "Hello";
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            for (int j = i+1; j <= wordLength; j++) {
                String substring = word.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
