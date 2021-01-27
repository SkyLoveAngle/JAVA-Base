package Homework0121;
import java.util.Arrays;
public class homework04 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[]{1,2,2,3,4,5,6};
        boolean result1 = containsDuplicate(arr1);
        System.out.println("arr1中是否含重复元素："+result1);
        boolean result2 = containsDuplicate(arr2);
        System.out.println("arr2中是否含重复元素："+result2);
    }
    private static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length-1;
        for (int i=0;i<n;i++){
            if (arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}

