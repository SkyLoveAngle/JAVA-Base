package Homework0124;
public class homework04 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
    private static int pivotIndex(int[] arr) {
        int sum =0;
        int leftsum =0;
        for (int x:arr){
            sum += x;
        }
        for (int i=0;i<arr.length;++i){
            if (leftsum == sum - leftsum - arr[i]){
                System.out.println("leftsum="+leftsum);
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
