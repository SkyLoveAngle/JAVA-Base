package Homework0101;
public class BubbleSort {
    public static void main(String[] args) {
        int [] nums= {12,23,7,58,29,44};
        System.out.println("排序前：");
        for (int num:nums) {
            System.out.print(num+" ");
        }

        for(int i=0;i<nums.length-1;i++) {
            for(int j=0;j<nums.length-1-i;j++) {
                if(nums[j]>nums[j+1]) {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后：");
        for (int num:nums) {
            System.out.print(num+" ");
        }
    }
}
