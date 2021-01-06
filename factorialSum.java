import java.util.Scanner;

public class factorialSum {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("请输入一个正整数：");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1;i<=n;i++){
            result += fac(i);
        }
        System.out.println("到"+n+"结束的阶乘求和是："+result);
    }

    public static int fac(int n) {
        int result =1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
}
