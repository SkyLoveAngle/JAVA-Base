//方法重载
/*
JAVA中允许方法重名，可能就会构成重载。
1.方法名相同并且方法的类型不同。
2.方法名相同方法参数个数不同。
构成重载和返回值类型无关，构成重载的两个方法必须在同一个类（同一个作用域）之中。
 */

public class AddTwoNum {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        System.out.println(result1);

        double result2 = add(10.5, 11.5);
        System.out.println(result2);

        int result3 = add(10, 20, 30);
        System.out.println(result3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}