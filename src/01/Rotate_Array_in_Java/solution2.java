package Rotate_Array_in_Java;

import java.util.Arrays;

// bubble rotate
// space complexity = O(1)
// time complexity = O(n*k)
public class solution2 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
//        int k = 3;
        int k = 9;
        System.out.println(Arrays.toString(rotateArray1(arr, n, k)));
    }

    private static int[] rotateArray1(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = n-1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}
