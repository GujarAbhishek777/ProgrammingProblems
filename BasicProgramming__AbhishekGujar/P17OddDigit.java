package BasicProgramming__AbhishekGujar;
//WAP TO PRINT ODD DIGIT FROM GIVEN NUMBER
import java.util.Scanner;

public class P17OddDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        while(n>0){
            int temp=n%10;
            if(temp%2!=0) {
                System.out.println(temp);
            }
            n=n/10;
        }
    }
}
