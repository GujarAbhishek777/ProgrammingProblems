package BasicProgramming__AbhishekGujar;

import java.util.Scanner;

public class P14PerfectNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a first range : ");
        int k=sc.nextInt();
        System.out.println("Please Enter a Second range : ");
        int n=sc.nextInt();
        for (int j=k;j<=n;j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == j) {
                System.out.println(j);
            }
//            else {
//                System.out.println("The Number is Not Perfect Number");
//            }
        }
    }
}
