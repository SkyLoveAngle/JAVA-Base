package Homework0118;

public class homework01 {


//    private String name = "Person";
//    int age = 0;
//}
//    public class Child extends homework01{
//        public String grade;
//     public static void main(String[] args){
//        homework01 p = new Child();
//        System.out.println( p.name);
//    }


//    static boolean Paddy ;
//    public static void main(String args[]){
//
//        System.out.println(Paddy);
//    }

//    public int aMethod(){
//        int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        homework01 test = new homework01();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }



//        public static void hello() {
//            System.out.println("hello");
//        }
//
//
//    public static void main(String[] args) {
//        String s = "";
//        System.out.println("s="+s);
//
//    }
//}
//    class MyApplication {
//        public static void main(String[] args) {
//            homework01 test=null;
//            test.hello();
//        }
}

//class HasStatic {// 1
//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        HasStatic hsl = new HasStatic();// 4
//        hsl.x++;// 5
//        HasStatic hs2 = new HasStatic();// 6
//        hs2.x++;// 7
//        hsl = new HasStatic();// 8
//        hsl.x++;// 9
//        HasStatic.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }
//}


// class TestDemo{
//    private int count;
//    public static void main(String[] args) {
//        TestDemo test=new TestDemo(88);
//        System.out.println(test.count);
//    }
//    TestDemo(int a) {
//        count=a;
//    }
//}

class Test{
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }

public static void main(String[] args) {
        System.out.println(new Test());
    }
}
