package Homework1225;
import java.util.Arrays;
public class homework03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println("数组元素为："+ Arrays.toString(arr));
        int[] output = transform(arr);
        printArry(output);
    }

    public static void printArry(int[] output) {
        for (int i=0;i<output.length;i++) {
        }
        System.out.println("变化后该数组元素为："+ Arrays.toString(output));
    }

    private static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            ret[i] = arr[i]*2;
        }
        return ret;
    }
}
