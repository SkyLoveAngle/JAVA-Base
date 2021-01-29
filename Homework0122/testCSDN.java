package Homework0122;
//public class testCSDN {
//    //向上转型
//    Animal animal1 = new Cat();//1
//
//    //向下转型,把1中父类的引用强行转变成子类的引用
//    //向下转型必须要确保animal指向的实例是一个Cat类型的实例才可以进行装换，否则这样的转换可能会失效。
//
//    Cat cat = (Cat)animal1;
//
//    Animal animal2 = new Bird();
//    //此处的向下转型就是存在问题的，虽然编译可以通过，但是运行时会报异常。
//    Cat cat2 = (Cat)animal2;
//
//    Animal animal3 = new Animal();
//    //此处的向下转型就是存在问题的，虽然编译可以通过，但是运行时会报异常。
//    Cat cat3 = (Cat)animal2;
//
//
//}
//
//public class Animal{
//
//}
//
//public class Cat extends Animal{
//
//}
//
//
//public class Bird extends Animal{
//
//}
//通过这个代码来说明在构造方法中调用重写的方法带来的问题。
class A {
    public A() {
        this.func();
    }
    public void func() {
        System.out.println("A.func()");
    }
}
class B extends A {
    private int num = 1;
    @Override
    public void func() {
        System.out.println("B.func() " + num);
    }
}
class TestCSDN {
    public static void main(String[] args) {
        B b = new B();
    }
}
