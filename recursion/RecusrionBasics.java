package recursion;

public class RecusrionBasics {
    public static void printDown(int n){
        if(n<=0){                           //base case
            return;
        }
        System.out.println(n + " ");        //processing before recusrion1
        printDown(n-1);                     //direct recursive call
    }
    public static void main(String[] args) {
        printDown(5);
    }
}
