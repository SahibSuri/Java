package recursion;

public class MergeSort {
    public static void mergesort(int[] arr , int left , int right){
        if(left<right){
            int mid = (left+(right-left)/2);        //avoids integer overflow
            // divide
            mergesort(arr, left, mid);
            mergesort(arr, mid+1, right);

            // conquer - merge
            merge(arr , left , mid , right);
        }
    }
    private static void merge(int[] arr , int left , int mid , int right){
        // create temp arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data
        for(int i = 0; i<n1; i++){
            L[i] = arr[left + i];
        }
        for(int j = 0; j<n2; j++){
            R[j] = arr[mid + 1 + j];
        }

        // merge back
        int i = 0 , j = 0 , k = left;
        while(i <n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }
        // for remaing elements
        while(i<n1){
            arr[k++] = L[i++];
            
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergesort(arr, 0, arr.length-1);

        for(int num: arr){
            System.out.println(num + " ");
        }
    }
}
