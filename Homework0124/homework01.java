package Homework0124;

import java.util.Arrays;
import java.util.Scanner;

//public class homework01 {
//}
//
//class While {
//    public void loop() {
//        int x= 10;
//        while ( x==10 ) {
//            System.out.print("x minus one is " + (x - 1));
//            x -= 1;
//        }
//    }
//}
class ArraysDemo {
    public  static  void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("输入一串数据，以逗号隔开");
        String  str = scan.nextLine().toString();
        System.out.println(str);

        String arr[] = str.split(",");
        System.out.println(Arrays.toString(arr));

        int b[] = new int[arr.length];
        for(int i = 0;i<b.length;i++){
            b[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(b);
        System.out.println("排序后的数组(以字符串形式输出)："+Arrays.toString(b));

    }
}

