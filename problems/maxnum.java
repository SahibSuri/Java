package problems;

public class maxnum {
    public static int max(int[] arr){
        int maxi = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,22,13,23};
        System.out.println(max(arr));
    }
}
