import java.util.Scanner;

//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
public class outputInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        int result = print(num);
    }

    public static int print(int num) {
        if (num>9){
            print(num/10);
        }
        System.out.println((num%10));
        return 0;
    }

}
