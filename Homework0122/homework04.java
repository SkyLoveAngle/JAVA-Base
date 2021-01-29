package Homework0122;
import java.util.Arrays;
public class homework04 {
    public static void main(String[] args) {
        int[] arr = new int[]{-10,-8,-6,2,4,6,7};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    private static int[] sortedSquares(int[] arr) {
        int len = arr.length;
        int[] arr1 = new int[len];
        for (int i=0,j=len-1, pos=len-1;i<=j;){
            if (arr[i]*arr[i] > arr[j]*arr[j]){
                arr1[pos] = arr[i]*arr[i];
                ++i;
            }else{
                arr1[pos]=arr[j]*arr[j];
                --j;
            }
            --pos;
        }
        return arr1;
    }
}
