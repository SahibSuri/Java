package problems;
// multiply each element by 10
public class multen {
    public static int[] mulbyten(int[] arr){
        int size = arr.length;
        int newarr[] = new int[size];
        for(int i = 0; i<size;i++){
            int element = arr[i];
            int newelement = element*10;
            newarr[i] = newelement;
        }
        // return updated array
        return newarr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ansarr = mulbyten(arr);
        for(int i:ansarr){
            System.out.println(i);
        }
    }
}
