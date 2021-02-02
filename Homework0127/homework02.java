package Homework0127;
import java.util.Arrays;
import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入target：");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }

    private static int[] searchRange(int[] arr, int target) {
        int upper = upperBound(arr,target);
        int lower = lowerBound(arr,target);
        if (upper<lower){
            return new int[]{-1,-1};
        }
        return new int[]{lower,upper};
    }

    private static int lowerBound(int[] arr, int target) {
        int left=0;
        int right=arr.length -1;
        while(left <= right){
            int mid = left+((right-left)/2);
            if (target <= arr[mid]){
                right=mid-1;
            }else if (target > arr[mid]){
                left=mid+1;
            }
        }
        return left;
    }

    private static int upperBound(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left <= right){
            int mid = left+((right-left)/2);
            if (target >= arr[mid]){
                left=mid+1;
            }else if (target < arr[mid]) {
                right=mid-1;
            }
        }
        return right;
    }
}

