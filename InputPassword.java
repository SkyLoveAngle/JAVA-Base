import java.util.Scanner;
public class InputPassword {
    public static void main(String[] args) {
        inputPassword();
    }
    public static void inputPassword() {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("请输入密码：");
            String input = scanner.next();
            if (input.equals(password)) {
                System.out.println("您输入的密码正确！登陆成功！");
                break;
            } else {
                switch(i){
                    case 1:
                        System.out.println("您输入的密码错误1次！请重新输入！");
                        break;
                    case 2:
                        System.out.println("您输入的密码错误2次！请重新输入！");
                        break;
                    case 3:
                        System.out.println("您已经3次输入错误！密码已锁定！明天再试！");
                        break;
                }
            }
        }
    }
}
