package Homework0119;
//实现方法 contains, 能够判定字符串中是否包含子串。
public class homework10 {
    public static void main(String[] args) {
        String str1 = new String("a,b,c,d");
        String str2 = new String("a,b");
        boolean result = isAnagram(str1,str2);
        System.out.println(result);
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for(int i=0;i<arr2.length;i++){
            char temp2 = arr2[i];
            for( int j = 0;j<arr1.length;j++){
                char temp1 = arr1[j];
                if(temp1 == temp2){
                    if(i==arr2.length-1){
                        return true;
                    }
                    i++;
                    temp2 = arr2[i];
                }else{
                    i = -1;
                }
            }
        }
        return false;
    }
}
