package Homework0121;
public class homework05 {
    public static void main(String[] args) {
        String name = new String("alex");
        String typed = new String("aalexxe");
        boolean result = isLongPressedName(name,typed);
        System.out.println(result);
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}

