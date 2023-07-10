package Rotate_Array_in_Java;


import java.util.Arrays;

// Intermediate Array
// space and time complexity in O(n)
public class solution1 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        int k = 9     // k = k % n = 2;
        System.out.println(Arrays.toString(rotateArray(arr, n, k)));     // {5,6,7,1,2,3,4}
    }

    private static int[] rotateArray(int[] arr, int n, int k) {
        if (k > n){
            k = k % n;
        }

        int[] res = new int[n];

        // first loop for rotate 0th index to kth index
        for (int i = 0; i < k; i++) {
            res[i] = arr[n-k+i];
        }

        // here we add the first index in the kth position
        int j = 0;
        for (int i = k; i < n; i++) {
            res[i] = arr[j];
            j++;
        }
        return res;
    }
}
