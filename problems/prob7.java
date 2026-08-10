package problems;

import java.util.Arrays;

// swap first and last element
public class prob7 {
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
