package sorting;
import java.util.*;
public class bs {
    public static void bubbleSort(int[] arr) {
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j =0;j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArray(arr);
    }
}


// Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

// Just like air bubbles rise to the top of water, the largest element "bubbles up" to the end of the array after each pass.