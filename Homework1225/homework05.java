package Homework1225;

public class homework05 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for (int i=0;i<100;i++){
            arr[0] = 1;
            arr[i+1] = arr[i]+1;
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
