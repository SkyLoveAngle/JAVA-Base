package Homework0124;
import java.util.Arrays;
import java.util.Scanner;
public class homework05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串非负整数,用逗号隔开：");
        String  str = scanner.nextLine().toString();
        String arr[] = str.split(",");
        int A[] = new int[arr.length];
        for(int i = 0;i<A.length;i++){
            A[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("处理后的序列："+Arrays.toString(sortArrayByParity(A)));
    }

    private static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }
        return A;
    }
}
