package BasicProgramming__AbhishekGujar;
//WAP TO PRINT SUM OF FACTORS OF NUMBER
import java.util.Scanner;

public class P08SumOfFactorsOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of no : ");
        int n=sc.nextInt();
        System.out.println("The factors of the number "+n+" are as follows:");
        int sum=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("The sum of factors is :"+sum);
    }
}
