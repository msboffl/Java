package DataStructures.Arrays;

public class ContinuousSubArrays {
    public static void generateSubArrays(int[] arr) {
        int length = arr.length;

        for(int start = 0; start < length; start++) {
            for(int end = start; end < length; end++) {
                for(int i = start; i <= end; i++) {
                    System.out.println(arr[i] + " ");
                }
                System.out.println(); // Print a new line after each subarray
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        generateSubArrays(arr);
    }
}
