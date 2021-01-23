package Homework0117;
public class homework05 {
    public static int[] rotate(int arr[], int k) {
        k %= arr.length;
        while (k > 0) {
            int tmp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = tmp;
            k--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arr1[] = rotate(arr, k);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}