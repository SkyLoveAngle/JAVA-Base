package Homework0119;
//实现方法 indexOf, 能够找出字符串子串存在的位置。
public class homework09 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abcdef";
        System.out.println(Idx(a, b));

        String c = "xyz,abc,def";
        String d = "abc";
        System.out.println(Idx(c,d));

        String e = null;
        String f = "ccc";
        System.out.println(Idx(e,f));
}
    public static int Idx(String str1, String str2) {
        if (str1 == null || str1.length() < 1 || str2 == null || str2.length() < 1) {
            return -1;
        }
        if (str1.length() < str2.length()) {
            return -1;
        }
        char[] str_1 = str1.toCharArray();
        char[] str_2 = str2.toCharArray();
        for (int i = 0; i < str_1.length; i++) {
            boolean find = false;
            if (str_1[i] == str_2[0] && i + str_2.length <= str_1.length) {
                int equalcount = 1;
                for (int j = 1; j < str_2.length; j++) {
                    if (str_1[i + j] == str_2[j]) {
                        equalcount++;
                    }
                }
                if (equalcount == str_2.length) {
                    find = true;
                }
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }
}

