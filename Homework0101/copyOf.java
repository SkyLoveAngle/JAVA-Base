package Homework0101;
import java.util.Arrays;
public class copyOf {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int[] newarr=copyOf(arr);
        System.out.println("复制后的数组元素："+Arrays.toString(newarr));
        System.out.println("复制前的数组元素："+Arrays.toString(arr));
    }
    public static int[] copyOf(int[] arr1){
        int[] ret=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            ret[i]=arr1[i];
        }return ret;
    }
}
