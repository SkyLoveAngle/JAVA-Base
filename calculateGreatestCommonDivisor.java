import java.util.Scanner;

public class calculateGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cgcd=CGCD(a,b);
        System.out.println(a+"和"+b+"的最大公约数是"+cgcd);
    }

    public static int CGCD(int n,int m){
        int min = Integer.min(n,m);
        for(int i=min;i>0;i--){
            if(m%i==0 && n%i==0){
                return i;
            }
        }
        return 1;
    }
}
