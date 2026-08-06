package problems;

public class prob4 {
    public static void zerndone(int[] arr){
        int zeroes = 0;
        int ones = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                zeroes++;
            }
            if(arr[i] == 1){
                ones++;
            }
        }
        System.out.println("No. of zeroes: " + zeroes);
        System.out.println("No. of ones: " + ones);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,10,10,101,0,0,1,1,1,10,0};
        zerndone(arr);
    }
}
