package DataStructures.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + 1] = arr[i];
                arr[i] = 0;
            }
        }
    }
}
