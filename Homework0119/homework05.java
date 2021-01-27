package Homework0119;
public class homework05 {

    public static boolean isPalindrome1(int x) {
        String str = x + "";
        int i = 0;
        int j = str.length()-1;
        while ( i < j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int x = 1221;
        boolean result = isPalindrome1(x);
        System.out.println(result);
    }
}
