package BasicProgramming__AbhishekGujar;
//WAP TO PRINT FIRST 10 NUMBERS IN FIBONACCI SERIES
public class P06FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++){
            System.out.println(a+b);
        int temp=a+b;
         a=b;
         b=temp;
        }
    }
}
