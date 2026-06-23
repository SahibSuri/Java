Tail Recursion - recursive call is the last operation(can be optimized by compilers in some languages , though java dont do automatic tail call optimization)

Recursion vs Iteration - know when to chose(space vs time trade-off)

Backtracking - It is like a powerful form of recursion 
Backtracking is a technique where we try the choices(decisions) , if thaqt choice is wrong then we backtrack (undo) and try another choice , this is a trail-error systemetic way

Backtracking = recursion + choice + constraint + undo(backtrack)
there are multiple choices at every step so a decision tree is made
when we get the desired solution then store it or print it 
when we dont get a desired solution then we backtrack 

QuickSort - In this we chose a pivot element , elements lesser than pivot come before the pivot elemnt and elements greater than pivot comes to the right of the pivot element. The pivot then it is in its sorted position . Recursively apply this to the left and the right sub array.

Key Points in Code(QuickSort):
Lomuto Partition scheme (simple and commonly used in interviews).
Pivot chosen as last element (easy to implement, but not best in practice).
In-place sorting (no extra array needed except recursion stack).
For stability or better performance, companies often use Dual-Pivot or randomized pivot.
