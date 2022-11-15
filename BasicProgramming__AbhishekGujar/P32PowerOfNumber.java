package BasicProgramming__AbhishekGujar;
//WAP TO GET THE POWER OF THE NUMBER
import java.util.Scanner;

public class P32PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A Number: ");
        int n=sc.nextInt();
        System.out.println("Please Enter a power: ");
        int p=sc.nextInt();
        int res=1;
        for (int i=1;i<=p;i++){
           res=res*n;
        }
        System.out.println("The Answer is as: "+res);
    }
}
