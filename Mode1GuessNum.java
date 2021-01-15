import java.util.Random;
import java.util.Scanner;

public class Mode1GuessNum {
    public static void main(String[] args) {
        while(true){
            int choice = mean();
            if(choice==1){
                game();
            }else if (choice == 0){
                System.out.println("Goodbye!");
                break;
            }else{
                System.out.println("您的输入有误！请重新输入！");
                continue;
            }
        }
    }

    public  static void game() {
        Random random = new Random();
        int toGuess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字：");
            int num = scanner.nextInt();
            if(num < toGuess){
                System.out.println("您猜低了！");
            }else if(num > toGuess){
                System.out.println("您猜高了！");
            }else{
                System.out.println("恭喜您！猜对了！");
                break;
            }

        }

    }

    public static int mean() {
        System.out.println("================================");
        System.out.println("1.Begin The Game!");
        System.out.println("0.Exit The Game!");
        System.out.println("================================");
        System.out.println("请输入你的选择！");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
