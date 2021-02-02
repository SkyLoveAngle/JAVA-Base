package Homework0127;
import java.util.Arrays;
import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,1,14};
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入目标和：");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int len = arr.length;
        int[] result = new int[2];
        for (int i=0;i<len-1;i++){
            for (int j=1;j<len-1;j++){
                if (arr[i]+arr[j]==target ){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }
}
