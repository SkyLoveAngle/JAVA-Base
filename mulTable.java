import java.util.Scanner;
//打印乘法口诀表
public class mulTable {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row = 1; row <=n; row++){
            printLine(row);
        }

    }

    public static void printLine(int row) {
        for (int col = 1; col <= row; col++) {
            System.out.printf("%dx%d=%d ", col, row, row * col);
        }
        System.out.println();
    }
}
