package BasicProgramming__AbhishekGujar;
//WAP TO PRINT NUMBER IS PALINDOME OR NOT
import java.util.Scanner;

public class P23PlindromeProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int a=n;
        int abhi=0;
        while(n!=0){
            int temp=n%10;
            abhi=(abhi*10)+temp;
            n=n/10;
        }
        System.out.println("The reverse Number is: "+abhi);
        if(a==abhi){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("The number is not a Palindrome");
        }
    }
}
