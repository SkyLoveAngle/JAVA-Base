package Homework0124.ZhiBoKe;
import com.sun.deploy.net.proxy.pac.PACFunctions;

import java.util.Scanner;
public class yichang {
}






class TestException {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);

//        int[] a = {1, 2, 3};
//        System.out.println(a[100]);

//        try {
//            System.out.println("try 中异常之前的代码");
//            int[] a = {1, 2, 3};
//            System.out.println(a[0]);
//            System.out.println("try 中异常之后的代码");
//        } catch (Exception e) {
//            System.out.println("catch 异常");
//        } finally {
//            // finally 中的逻辑无论是前面的代码中是否触发异常, 都会执行到.
//            System.out.println("finally");
//        }
//
//        System.out.println("hello");

//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(System.in);
//            // 使用 scanner 进行若干操作
//            return ;
//        } catch (NullPointerException e) {
//            System.out.println("空指针异常");
//        }
//        // 进行善后工作, 比如, 关闭 scanner
//        scanner.close();

        // 此时当 try catch 代码块执行完毕之后, 就会自动针对 scanner 进行关闭.
//        try (Scanner scanner = new Scanner(System.in)) {
//            // 使用 Scanner 来进行若干操作
//        } catch (NullPointerException e) {
//            System.out.println("空指针异常");
//        }
//
//        try {
//            func1();
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("异常");
//        }
//    }
//
//    public static void func1() {
//        func2();
//    }
//
//    public static void func2() {
//        int[] a = {1, 2, 3};
//        System.out.println(a[100]);
//    }
//}


        Scanner sc = null;



        try {
            int num = sc.nextInt();
            System.out.println("num = " + num);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
            sc.close();
        }
    }
}