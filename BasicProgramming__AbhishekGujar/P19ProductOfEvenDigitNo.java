package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE PRODUCT OF EVEN DIGIT NUMBER
import java.util.Scanner;

public class P19ProductOfEvenDigitNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prod=1;
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        while(n>0){
            int temp=n%10;
            if(temp%2==0) {
                prod = prod * temp;
            }
            n=n/10;
        }
        System.out.println("The Product of all Even Digit is: "+prod);
    }
}
