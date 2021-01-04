import java.util.Scanner;
public class juadgeAge {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入年龄：");
            int age=scan.nextInt();
            if(age<=18) {
                System.out.println(age+"是少年");
            }
            if(age>=19&&age<=28) {
                System.out.println(age+"是青年");
            }
            if(age>=29&&age<=55) {
                System.out.println(age+"是中年");
            }
            if(age>=56) {
                System.out.println(age+"是老年");
            }
        }
    }
