public class kadanes_algo{
    public static void main(String[] args) {
        int[] arr = {1,-2,-3,9,-8,7,4,5,6};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i =0;i<arr.length;i++){
            currSum = currSum + arr[i];

            if(currSum>maxSum){
                maxSum = currSum;
            }

            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println("Max Sub array sum: " + maxSum);
    }
}