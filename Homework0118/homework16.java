package Homework0118;
import java.util.Arrays;
public class homework16 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        exchange(arr1,arr2);
    }
    private static void exchange(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));
    }
}
