package problems;

public class prob5 {
    public static void checkUnsorted(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("First unsorted at: " + arr[i+1]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        checkUnsorted(arr);
    }
}
