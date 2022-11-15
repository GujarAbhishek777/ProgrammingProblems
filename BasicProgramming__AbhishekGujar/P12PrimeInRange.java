package BasicProgramming__AbhishekGujar;
//WAP TO PRINT PRIME NUMBER IN RANGE
import java.util.Scanner;

public class P12PrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter a first range : ");
        int k=sc.nextInt();
        System.out.println("Please Enter a Second range : ");
        int n=sc.nextInt();
        for (int j=k;j<=n;j++) {
            int count=0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(j);
            }
           // else {
          //      System.out.println("It is not a Prime Number");
            //}
        }
    }
}
