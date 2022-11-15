package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE FACTORS OF A NUMBER
import java.util.Scanner;

public class P07FactorsOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of no : ");
        int n=sc.nextInt();
        System.out.println("The factors of the number "+n+" are as follows:");
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
