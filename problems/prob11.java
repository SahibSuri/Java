package problems;

import java.util.Arrays;

// shift array element by one position
public class prob11 {
    public static void shift(int[] arr){
        if(arr == null || arr.length<=1) return;
        int last = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        shift(arr);
        System.out.println(Arrays.toString(arr));
    }
}
