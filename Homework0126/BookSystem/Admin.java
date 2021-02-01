package Homework0126.BookSystem;
import Homework0126.BookSystem.opertion.*;
import java.util.Scanner;

public class Admin extends User {
    /*
    private String name;
    //管理员能够支持的操作，这些操作存在于IOperation这个接口里面
    //我们可以定义一个IOperation[]数组,因为我们知道接口无法实现实例化
    //所以这个数组中放置的内容，就是实现了该接口类的实例。
    //这里也能解释为什么我们要把若干个操作提取出共同信息，创建一个IOperation接口
    //因为如果过不把这些操作类提取出共性搭建接口的话，在管理员类中就很难用过一个数组来描述管理员自身
    //都支持哪些操作。
    private IOperation[] operations;
    */
    public Admin(String name){
        this.name = name;
        this.operations = new IOperation[] {
                new FinOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }
    @Override
    public int menu() {
        System.out.println("=========================");
        System.out.println("Hello! " + name + ", 欢迎使用图书管理系统！");
        System.out.println(" 1. 查阅书籍信息");
        System.out.println(" 2. 新增书籍信息");
        System.out.println(" 3. 删除书籍信息");
        System.out.println(" 4. 打印书籍列表");
        System.out.println(" 5. 退出系统");
        System.out.println("=========================");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
