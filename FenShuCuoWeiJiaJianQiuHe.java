
public class FenShuCuoWeiJiaJianQiuHe {
    public static void main(String[] args) {
        System.out.println("n=100,sum="+calculateSeries(100));
    }
    public static double calculateItem(int n){
        return (1.0/(n-1)) + (1.0/n);
    }
    public  static double calculateSeries(int n){
        double sum =0;
        for(int i=0;i<=n;i+=2){
            sum = calculateItem(i);
        }
        return sum;
    }
}
