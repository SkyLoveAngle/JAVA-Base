import java.util.Scanner;
public class factorial {
        public static void main(String[] args){
            System.out.printf("请输入任意一个数：");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int a = 1;
            for(int i = 1;i <= n;i++){
                a *= i;
               // System.out.printf("%d\n",a);
            }
            System.out.printf("%d的阶乘为：%d\n",n,a);
        }
    }



