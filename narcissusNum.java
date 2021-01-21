public class narcissusNum {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
        if (isNarcissusNum(i)) {
            System.out.println(i);
        }
    }
}
    public static boolean isNarcissusNum(int num) {
        int theUnit = num % 10;
        int tmp = num / 10;
        int decade = tmp % 10;
        tmp = num / 100;
        int hundred = tmp % 10;
        if (power3(theUnit) + power3(decade)
                + power3(hundred) == num) {
            return true;
        }
        return false;

    }
    public static int power3(int num) {
        return num*num*num;
    }
}
