package recursion;

import java.util.Scanner;
import java.util.Random;

public class bs {

    // Recursive Binary Search Function
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Different input sizes
        int[] sizes = {1000, 5000, 10000, 50000, 100000, 500000};
        System.out.println("Exp done by Sahib Suri A2305224361");
        System.out.println("Recursive Binary Search Performance");
        System.out.printf("%-10s %-20s\n", "N", "Time (nanoseconds)");

        for (int n : sizes) {

            int[] arr = new int[n];

            // Create sorted array
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            // Search for a random element
            Random rand = new Random();
            int key = arr[rand.nextInt(n)];

            // Measure execution time
            long startTime = System.nanoTime();

            int result = binarySearch(arr, 0, n - 1, key);

            long endTime = System.nanoTime();

            long timeTaken = endTime - startTime;

            System.out.printf("%-10d %-20d\n", n, timeTaken);

            // Uncomment if you want to verify the result
            // System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}