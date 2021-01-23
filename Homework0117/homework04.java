package Homework0117;
import java.util.Arrays;
import java.util.Scanner;
public class homework04 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(toLowerCase(str));
    }
    private static String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        String arr1= Arrays.toString(arr);
        return arr1;
    }
}
