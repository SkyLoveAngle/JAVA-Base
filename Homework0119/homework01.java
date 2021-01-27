package Homework0119;

public class homework01 {

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }


    public static void main(String args[]) {
        int result = getValue(2);
        System.out.println(result);
    }
}
/*            int i = 7;
            do {
                System.out.println(--i);
                --i;
            } while (i != 0);
            System.out.println(i);
        }
 */


