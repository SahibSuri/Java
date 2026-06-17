Recursion is function calling itself.

lets say main function class abc function and abc function calls itself again and again till the function is calling repeatedly itself , where all these calls end that point is called BASE CASE.

(a) For BASE CASE , this is like a escape hatch , the simnplest , smallest input where the method returns immedeatly without calling itself again.
If there is no BASE CASE present then the recursion never stops(StackOverflowError).

(b) Recursive relation/step - "faith step"
we reduce the current problem into a smaller sub problem of the same type , then call the same method on a smaller instance. this is where the method calls itself directly.

(c) Processing direction - (Top-Down vs Bottom-Up)
In classic recursion we use Top-Down , that is we break the problems into the smaller sub problem on the way down the call stack and combine results on the way up(unwinding)

Real-world analogy - Imagine going to the ground floor to get some food from the kitchen
Base Case - already at the ground floor 
Recursive step - while going downward using the staircase - take one step down and ask yourself to continue on the lower floor . The call stack is the trail of breadcrumbs (stack frames) you leave so you can climb back up with the answer.

(d) 