package BasicProgramming__AbhishekGujar;

import java.util.Scanner;
//WAP TO DISPLAY SUM OF NATURAL NUMBERS OF GIVEN RANGE
public class P01SumOfnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first range value:");
        int i=sc.nextInt();
        System.out.println("Enter end range:");
        int n=sc.nextInt();
        int sum=0;
        for ( ;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
