package recursion;
// sum of first N natural numbers
public class sfn {
    public static int sum(int n){
        if(n == 0){             //base case
            return 0;
        }
        return n + sum(n-1);            //recursive
    }
    public static void main(String[] args) {
        System.out.println(sum(50));
    }
}
