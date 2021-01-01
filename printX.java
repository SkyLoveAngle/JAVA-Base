import java.util.Scanner;
public class printX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    //    System.out.println("请输入一个正整数："+ input);
        while(input.hasNext()) {
            int n=input.nextInt();
            char [][] arr = new char[n][n];
            for(int i=0;i<n;i++) {
                arr[i][i]='*';
            }
            for(int j=0;j<n;j++) {
                arr[j][n-j-1]='*';
            }
            for(int i=0;i<n;i++) {
                int j=0;
                for(j=0;j<n;j++) {
                    System.out.printf("%c",arr[i][j]);
                }
                if(j==n) {
                    System.out.println("\n");
                }
            }
        }
    }
}