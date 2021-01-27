package Homework0119;
//实现方法 replace, 能够替换字符串中的某个部分。
public class homework08 {
    public static void main(String[] args) {
        String str="aaabcdefgaaaabcdefg";
        System.out.println(replace(str,'a','#'));
    }
    public static String replace(String str,char oldChar,char newChar) {
            String newStr="";
            for(int i=0;i<str.length();i++) {
                if(oldChar == str.charAt(i)) {
                    newStr = newStr+newChar;
                }else {
                    newStr = newStr+str.charAt(i);
                }
            }
            return newStr;
        }
}
