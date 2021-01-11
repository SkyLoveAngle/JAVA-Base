import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        /*
        for (int i=1;i<=100;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        if (isprime(num)){
            System.out.println(num+"是素数！");
        }else{
            System.out.println(num+"不是素数！");
        }
    }

    public static boolean isprime(int num) {
        if (num==1||num==0){
            return false;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
