package BasicProgramming__AbhishekGujar;
//WAP TO PRINT SUM OF ALL THE DIGITS IN THE NUMBER
import java.util.Scanner;

public class P18SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        while(n>0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        System.out.println("The sum of all Digit is: "+sum);
    }
}
