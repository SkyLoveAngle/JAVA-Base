package Homework0120;
import java.util.Arrays;
public class homework05 {
    public static void main(String[] args) {
//        int m[]={0};
//        int n[]= {2};

        int m[]={1,2,3,0,0,0};
        int n[]= {2,5,6};
        merge(m,3,n,3);
    }
    public static  void merge(int[] nums1, int m, int[] nums2, int n)  {
        int n1=m-1;
        int n2=n-1;
        int len=m+n-1;
//        if (n1<0&&n2<0){
//            System.out.println("你的输入有问题！");
//        }
//        if (n1<0&&n2>=0){
//            System.out.println(Arrays.toString(nums2));
//        }
//        if (n2<0&&n1>=0){
//            System.out.println(Arrays.toString(nums1));
//        }
//        if (n1>=0&&n2>=0) {
//            if(nums1[n1]>nums2[n2]) {
//                nums1[len]=nums1[n1];
//                len--;
//                n1--;
//            } else {
//                nums1[len]=nums2[n2];
//                len--;
//                n2--;
//            }
//
//        }
//        System.out.println(Arrays.toString(nums1));
//    }
        while(n1>=0&&n2>=0) {
            if(nums1[n1]>nums2[n2]) {
                nums1[len]=nums1[n1];
                len--;
                n1--;
            }
            else {
                nums1[len]=nums2[n2];
                len--;
                n2--;
            }
        }
        //System.arraycopy(nums2, 0,nums1,0,n2+1);
        System.out.println(Arrays.toString(nums1));
    }
}
