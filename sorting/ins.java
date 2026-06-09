package sorting;
// insertion sort
// we divide the aray into the two part one sorted part and one unsorted part
// the first element is always considered sorted
// then we pick the elements from the unsorted part and insert them into the correct position in the sorted part

public class ins {

    public static void insertionSort(int arr[]) {

        int n = arr.length;

        for(int i = 1; i < n; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {5,4,1,3,2};

        insertionSort(arr);

        printArr(arr);
    }
}