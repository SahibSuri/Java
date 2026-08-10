package problems;

import java.util.Arrays;

// print extreme elements in alternate manner
public class prob12 {
    public static void pam(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            if(left == right){
                System.out.println(arr[left]);
            }else{
                System.out.println(arr[left] + " " + arr[right] + " ");
            }
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        pam(arr);
        System.out.println(Arrays.toString(arr));
    }
}
