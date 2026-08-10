package problems;

import java.util.Arrays;

// reverse part of an array
public class prob9 {
    public static void revpart(int[] arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        revpart(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
