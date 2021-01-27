package Homework0118;
public class homework04 {
    public static int removeElement(int[] nums, int val) {
        int i=-1;
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=val) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums=new int[] {0,1,2,2,3,0,4,2};
        int len = removeElement(nums,2);
        System.out.println("去除val后数组新长度："+len);
        for(int i=0;i<len;i++) {
            System.out.print(nums[i]+"  ");
        }
    }
}
