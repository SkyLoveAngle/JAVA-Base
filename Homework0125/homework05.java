package Homework0125;
import java.util.Arrays;
public class homework05 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    private static int[] plusOne(int[] arr) {
        int len =arr.length-1;
        for (int i=len;i>=0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}
