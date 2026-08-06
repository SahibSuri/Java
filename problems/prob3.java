package problems;

public class prob3 {
    public static void sum(int[] arr){
        int posSum = 0;
        int negSum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > 0){
                posSum += arr[i];
            }
            if(arr[i] < 0){
                negSum += arr[i];
            }
        }
        System.out.println("Positive sum: " + posSum);
        System.out.println("Negative sum: " + negSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,-2,-3,-4,-5};
        sum(arr);
    }
}
