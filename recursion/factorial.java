package recursion;

public class factorial {
    public static int calcFactorial(int n){
        if(n<=1){
            return 1;
        }
        int res = n*calcFactorial(n-1);
        System.out.println(" X " + n);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Factorial steps: ");
        int result = calcFactorial(5);
        System.out.println(" = " + result);
    }
}
