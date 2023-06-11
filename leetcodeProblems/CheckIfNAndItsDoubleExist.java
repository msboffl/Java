package leetcodeProblems;

import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExists(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length;i++) {
            map.put(arr[i], i);
        }
        // System.out.println(map);

        for(int i = 0; i< arr.length; i++) {
            if(map.containsKey(2 * arr[i])) {
                if(map.get(2 * arr[i]) != i) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 5, 3};
        System.out.println(checkIfExists(arr));

        arr = new int[]{3, 1, 7, 11};
        System.out.println(checkIfExists(arr));
    }
}
