import java.util.Scanner;
//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
public class outputBinaryNum {
    public static void main(String[] args) {
        int[] arry = new int[33];
        System.out.print("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 31; num != 0; i--) {
            arry[i] = num % 2;
            num /= 2;
        }
        System.out.print(num + "的二进制为：");
        for (int i = 0; i <= 32; i++) {
            System.out.print(arry[i]);
        }
        System.out.println();
        System.out.println("奇数位是：");
        for (int i = 1; i < 31; i += 2) {
            System.out.print(arry[i]+" ");
        }
        System.out.println();
        System.out.println("偶数位是：");
        for (int i = 0; i <=30; i += 2) {
            System.out.print(arry[i]+" ");
        }
    }
}
