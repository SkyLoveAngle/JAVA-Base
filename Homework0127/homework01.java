package Homework0127;
public class homework01 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str1 = new String("+42");
        System.out.println(myAtoi(str1));

        String str2 = new String("-42");
        System.out.println(myAtoi(str2));

        String str3 = new String("4193 with word");
        System.out.println(myAtoi(str3));

        String str4 = new String("words and 987");
        System.out.println(myAtoi(str4));

        String str5 = new String("-91283472332");
        System.out.println(myAtoi(str5));
    }

    private static int myAtoi(String str) {
        int len=str.length();
        char[] charArray = str.toCharArray();

        int index = 0;
        while(index<len && charArray[index] ==' '){
            index++;
        }
        if (index == len){ //此时字符串全是空格
            return 0;
        }

        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+'){
            index++;
        }else if (firstChar == '-'){
            index++;
            sign=-1;
        }

        int res =0;
        while(index<len){
            char currChar = charArray[index];
            if(currChar >'9' || currChar<'0'){
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)){
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (currChar-'0');
            index++;
        }
        return res;
    }
}
