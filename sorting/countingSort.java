package sorting;
public class countingSort{

    public static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE;

        // find largest element
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        // create count array
        int[] count = new int[largest+1];

        // store frequencies
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // rebuild sorted array
        int j = 0;
        for(int i =0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,1,1,8};
        countSort(arr);
        printArray(arr);
    
    }
}