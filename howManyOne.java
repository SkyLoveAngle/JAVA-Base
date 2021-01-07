import java.util.Scanner;
public class howManyOne {
    public static void main(String[] args) {
        int count=0;
        int i=0;
        System.out.print("请输入一个十进制整数:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (i=0;i<32;i++){
            if(((num>>i)&1)==1){
                count++;
            }
        }
        System.out.println("二进制中1的个数为："+count);
    }
}



