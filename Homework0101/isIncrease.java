package Homework0101;

public class isIncrease{
public static boolean induge(int[]arr) {
        for(int i=0;i<arr.length-1;i++) {//之所以是arr.length是为了避免越界
        if (arr[i] > arr[i + 1]) {
        return false;
        }
        }
        return true;
        }
public static void main(String[] args) {
        int []arr = {1,2,3,41,5,6};
        System.out.println(induge(arr));
        }
}

