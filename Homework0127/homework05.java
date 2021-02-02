package Homework0127;
public class homework05 {
    public static void main(String[] args) {
        String a = "1011";
        String b = "0101";
        String str = addBinary(a,b);
        System.out.println(str);
    }

    public static String addBinary(String a, String b) {
        StringBuffer s = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;   //进位
        for( ;i >= 0||j >= 0; i--,j-- )
        {
            int a1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int b1 = j >= 0 ? b.charAt(j) - '0' : 0;
            int tmp = a1 + b1 + c;

            if(tmp < 2)   //小于2  没有产生进位
            {
                s.append(tmp + "");
                c = 0;
            }
            else if(tmp == 2)  //进位为 1 ，本位为0
            {
                s.append("0");
                c = 1;
            }
            else
            {
                s.append("1"); //进位为 1 ，本位 为 1
                c = 1;
            }
        }
        if(c == 1)
        {
            s.append("1");
        }
        return Reverse(s.toString());// 用逆序方法逆序
    }



    public static String Reverse(String s)
    {
        char[] chars = s.toCharArray();
        int i = 0;
        int len = s.length() - 1;
        while(i < len)
        {
            char tmp = chars[i];
            chars[i] = chars[len];
            chars[len] = tmp;
            i ++;
            len --;
        }
        return String.valueOf(chars);

    }

}
