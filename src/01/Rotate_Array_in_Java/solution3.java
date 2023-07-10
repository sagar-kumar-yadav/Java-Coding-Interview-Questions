package Rotate_Array_in_Java;

import java.util.Arrays;


// Reversal
// space : O(1)
// time : O(n)
public class solution3 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        int k = 9;
        System.out.println(Arrays.toString(rotateArray2(arr, n, k)));
    }

    private static int[] rotateArray2(int[] arr, int n, int k) {
        // divide the array into two parts
        if (k > n) {
            k = k % n;
        }

        // length of first part
        int a = arr.length - k;

        reverse(arr, 0, a-1);
        reverse(arr, a, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }

    private static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) {
            return;
        }

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
