package Homework0118;
public class homework05 {
    public static int searchInsert(int[] nums, int target) {
        int len= nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums=new int[] {1,2,5,6};
        int len = searchInsert(nums,3);
        System.out.println("索引值："+len);
        }
    }
