package recursion;
// Tail recursion is a recursion where the recursive call is the last statement in a function.
// no calculation is performed after recursive call
// whenever new call occurs it reuses the old stack frame
// by this compiler/stack optimization is possible so that loop can be made

public class TailRecursion{
    public static long Factorial(int n , long result){
        if(n==0 || n==1) return result;
        return Factorial(n-1, n*result);
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5, 1));
    }
}

// Tail recursion:
// space complexity in normal recursion in O(n)[stack space] , but TR has O(1)[stack space]
// faster execution in language that supports TCO
// TCO is tail call optimization used by language compilers to save memory.
// When a recursive call is the last thing a function does TCO reuse the current function stack frame instead of creating a new one
// This prevents StackOverflowErrors