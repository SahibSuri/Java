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