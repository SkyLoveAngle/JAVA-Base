package Homework0119;
public class homework04 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            int j = judge(chars, ransomNote.charAt(i));
            if(j != -1){
                chars[j] = '0';
            }else{
                return false;
            }
        }
        return true;
    }

    public static int judge(char[] chars,char a){
        for(int i = 0; i< chars.length;i++){
            if(a == chars[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "cdef";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

}
