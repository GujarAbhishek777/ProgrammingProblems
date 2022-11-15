package BasicProgramming__AbhishekGujar;
//WAP TO PRINT NUMBER IS PRIME IR NOT
import java.util.Scanner;

public class P11PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Please Enter a Number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
          if(n%i==0){
              count++;
          }
        }
        if(count==2){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is not a Prime Number");
        }
    }
}
