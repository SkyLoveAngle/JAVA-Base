package Homework0122;
import java.util.Scanner;
public class homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++){
            System.out.print(reverseOnlyLetters(str).charAt(i));
        }
    }

    private static String reverseOnlyLetters(String str) {
        char[] chArray = str.toCharArray();
        int left = 0;
        int right = chArray.length - 1;
        while (left < right) {
            while (left < chArray.length && Character.isLetter(chArray[left])==false) {
                left++;
            }
            while (right >= 0 && Character.isLetter(chArray[right])==false) {
                right--;
            }
            if (left < right) {
                char temp = chArray[left];
                chArray[left] = chArray[right];
                chArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chArray);
    }
}

