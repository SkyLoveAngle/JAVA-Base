
public class calNineNumber {
    public static void main(String[] args) {
        int count = calNineCount();
        System.out.println("1-100之间的数字含有9的个数是："+count);
    }
    public static int calNineCount() {
        int count =0;
        for(int i=0;i<=100;i++){
            if(i%10==9){
                count++;
            }
            if((i/10)%10==0){
                count++;
            }
        }
        return count;
    }
}
