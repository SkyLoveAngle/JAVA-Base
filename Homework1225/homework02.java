package Homework1225;

public class homework02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("该数组所有元素的和为："+sum(arr));
    }

    public static double sum(int[] arr) {
        int ret=0;
        int sum;
        for (int x:arr) {
            ret += x;
        }
        sum = ret;
        return sum;
    }
}
