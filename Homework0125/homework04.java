package Homework0125;
public class homework04 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,4,2,2,1};
        System.out.println(thirdMax(arr));
    }
    private static int thirdMax(int[] arr) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for (int num : arr) {
            max1 = Math.max(max1, num);
        }
        for (int num : arr) {
            if (num == max1) {
                continue;
            }
            max2 = Math.max(max2, num);
        }
        for (int num : arr) {
            if (num == max1||num==max2) {
                continue;
            }
            max3 = Math.max(max3, num);
        }
        return (int) (max3 == Long.MIN_VALUE ? max1 : max3);
    }
}
