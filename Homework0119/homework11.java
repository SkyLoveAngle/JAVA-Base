package Homework0119;
//实现方法 compareTo, 能够实现按照字典序比较字符串大小。
//s1大于s2返回值大于零，等于返回0，小于返回值小于零
public class homework11 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        int result1 = compareTo(s1,s2);
        System.out.println(result1);
        String s3 = "bbb";
        String s4 = "aaa";
        int result2 = compareTo(s3,s4);
        System.out.println(result2);
        String s5 = "abc";
        String s6 = "abd";
        int result3 = compareTo(s5,s6);
        System.out.println(result3);
    }

    public static int compareTo(String s1, String s2){
        int shortLen = 0;
        if(s1.length() >= s2.length()){
            shortLen = s2.length();
        }else{
            shortLen = s1.length();
        }
        for(int i = 0; i < shortLen; i++){
            if(s1.charAt(i) > s2.charAt(i)){
                return 1;
            }
            if(s1.charAt(i) < s2.charAt(i)){
                return -1;
            }
        }
        if(s1.length() == s2.length()) {
            return 0;
        }
        while(s1.length() > s2.length()){
            return 1;
        }
        return -1;
    }
}
