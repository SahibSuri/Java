package recursion;

public class printUp{
    public static void printingUp(int n){
        if(n<=0){           //base case
            return;
        }
        printingUp(n-1);                //we just called the function first than printing like in downwards 
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        printingUp(5);
    }
}