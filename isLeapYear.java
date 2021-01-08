 public class isLeapYear {
    public static void main(String[] args) {
        int count=0;
        for(int year=1000;year<=2000;year++){
            if(Leapyear(year)){
                System.out.println(year+"是闰年！");
                count++;
            }
        } System.out.println("1000-2000年内总共有"+count+"闰年！");
    }
    public static boolean Leapyear(int year) {
        if (year%100==0){
            if (year%400==0){
                return true;
            }else{
                return false;
            }
        }else{
            if (year%4==0){
                return true;
            }else{
                return false;
            }
        }
    }
}
