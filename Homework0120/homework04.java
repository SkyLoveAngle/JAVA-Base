package Homework0120;

public class homework04 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lengthOfLastWord(str));
    }

    private static int lengthOfLastWord(String str) {
        int length = str.length();
        String[] arr = str.split(" ");
        if (str.isEmpty()){
            return 0;
        }else{
            String str1 = new String(arr[arr.length-1]);
            return str1.length();
        }
    }
}
