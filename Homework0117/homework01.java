package Homework0117;

public class homework01 {

    public static void main(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+""+(x+y)+y);
        int result = mystery(1234);
        System.out.println(result);
    }

    public static int mystery(int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
        return 0;
    }


}
