package recursion;

public class factorial {
    public static int calcFactorial(int n){
        if(n<=1){           //base case
            return 1;
        }
        return n*calcFactorial(n-1);            //recursive step
    }
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
}
