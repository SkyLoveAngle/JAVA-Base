package Homework0118;
import java.util.Arrays;
//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面。
public class homework15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(transform(arr)));
    }
    public static int[] transform(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            while(arr[left]%2==0){
                left++;
            }
            while (arr[right]%2!=0){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }
}
