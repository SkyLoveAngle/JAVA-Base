package Homework0101;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        System.out.print("请输入要查找的数字：");
        Scanner sc=new Scanner(System.in);
        int tofind=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int ret=find(arr,tofind);
        System.out.println(tofind+"所在的下标位置是："+ret);
        sc.close();
    }
    public static int find(int[]arr1,int tofind){
        int left=0;
        int right=arr1.length - 1;
        while(left <= right){
            int mid=(left+right)/2;
            if(tofind<arr1[mid]){
                right=mid-1;
            }else if(tofind>arr1[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
