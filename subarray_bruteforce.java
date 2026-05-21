public class subarray_bruteforce {
    public static void main(String[] args) {
        int[] arr = {-2,1,2,3,4,5,67,5,22,23,13,46};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int sum = 0;

                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
