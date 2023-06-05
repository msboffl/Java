package gfgProblems;

import java.util.Scanner;

class Solution {
    String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversed.append(words[i]);
            if (i != words.length - 1) {
                reversed.append(" ");
            }
        }

        return reversed.toString().trim();
    }
 }
public class ReverseWordsInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
