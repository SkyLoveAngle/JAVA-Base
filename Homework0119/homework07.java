package Homework0119;
//实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
import java.util.Arrays;
public class homework07 {
    public static void main(String[] args) {
        String str = new String("123.456.789.00");
        String[] arr = mySplit(str, '.');
        System.out.println(Arrays.toString(arr));
    }

    public static  String[] mySplit(String str, char char1){
        String[] cur = new String[5];
        int k = 0;
        int j = 0;
        char[] tmp = str.toCharArray();
        String s1 = new String();
        for (int i = 0; i < tmp.length ; i++) {
            if(tmp[i] == char1){
                while (k < i){
                    s1 = s1 + tmp[k];
                    k++;
                }
                cur[j] =s1;
                j++;
                k = i + 1;
                s1 = "";
            }else if(i == tmp.length -1){
                while (k < i + 1){
                    s1 = s1 + tmp[k];
                    k++;
                }
                cur[j] = s1;
            }
        }
        return cur;
    }
}
