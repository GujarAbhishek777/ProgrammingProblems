package BasicProgramming__AbhishekGujar;
//WAP TO PRINT NUMBER IS PERFECT NUMBER OR NOT
import java.util.Scanner;

public class P13PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a Number to Check no. is perfect or not: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println(" The Number is Perfect Number");
        }else{
            System.out.println("The Number is Not Perfect Number");
        }
    }
}
