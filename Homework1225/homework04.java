package Homework1225;

public class homework04 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
