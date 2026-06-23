Ques- Explain merge sort algo?
<br>
Ans- merge sort is a divide and conquer algo , it recursively divides the array into two halves into sub arrays until each sub array contains only one element (which is already sorted) , then it meges the sorted sub array to produce one final sorted array 
Steps:
divide - find the middle point and recursively sort the left and the right halves.
conquer - merge the two sorted halves into a single sorted array.
At each level, the merge operation across all sub-arrays takes O(n) time. There are log n levels in the recursion tree. Therefore, Time Complexity = O(n log n) in Best, Average, and Worst cases.
Space Complexity: O(n) due to temporary arrays used during the merge step. The recursion depth adds O(log n) stack space.
<hr>

Ques- why is merge sort is preffered over quick sort in certain scenarios
<br>
ans- quick sort has an average time complexity of O(nlogn) but can degrade to O(n2) in the worst case (ex - already sorted array with a poor pivot selection) , whereas merge sort always guarantees O(nlogn) time.
<br>
##Advantages of merge sort:
=> Guarantees performance
=> Stable sorting imp. when sorting objects by multiple keys
=> Excellent for external sorting when data does not fit in the main memory
<br>
##Disadvantage
=> Requires O(n) extra space
=> Quick Sort is in-place and has better cache performance in practice for in-memory sorting.
In Java, Arrays.sort() uses Dual-Pivot Quick Sort for primitive types and TimSort (a hybrid of Merge Sort and Insertion Sort) for objects.

<hr>
Ques- how does Array.sort() works internally in java?
<br>
ans- this is a hybrid algorithm
**for primitive types**(int , double , etc) - it uses dual pivot quick sort
**for object references**(integer , String , custom classes) - it uses TimSort , which is a stable merge sort combined with insertion sort
**For small sub-arrays** (typically < 32 or 64 elements), it switches to Insertion Sort for better performance.

<hr>
Ques- Is merge-sort in-place?
<br>
Ans- No, the standard implementation uses O(n) extra space . In-place versions exist but are slower in practice

<hr>
Ques- Best , Average , Worst Case Time complexity
<br>
O(nlogn) in all case

<hr>
Ques- when would you chose merge-sort?
<br>
ans- when stability is required , for large dataset , external sorting , or when guaranteed performance is needed.

<hr>
Ques- Explain QuickSort and its time complexity?
<br>
Ans- QuickSort is divide and conquer algo that selects the pivot and partition around it. Avergae and best time is O(nlogn) , worst is O(n2) . Space is O(logn) on average due to recursion stack , it is in-place and cache friendly

<hr>
Ques- How to optimize QuickSort optimize worst case O(n2)?
<br>
Ans- Use randomized pivot selection
    median of three method
    switch to heap sort or merge sort if recursion depth become too large
    use dual-pivot as in java's implementation

<hr>
Ques- Difference between Quick Sort and Merge Sort?
<br>
Ans:
    -Quick Sort is in-place(better space) , merge sort needs O(n) space
    -Merge sort is stable and guarantees O(nlogn) , Quick sort is not stable and has O(n2) worst case
    -Quick Sort has better cache performance in practice