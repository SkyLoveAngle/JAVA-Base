package Homework1225;
//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class homework01 {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("数组中所有元素的平均值是："+avg(arr));
    }

    public static double avg(int[] arr) {
        int ret =0;
        double average;
        for (int x:arr){
            ret += x;
        }
        average = ret / arr.length;
        return average;
    }
}
