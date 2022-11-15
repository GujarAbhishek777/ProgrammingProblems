package BasicProgramming__AbhishekGujar;
//WAP TO FIND DICOUNT BASED ON THE EVEN ODD DIGIT NUMBER
import java.util.Scanner;

public class P20Imp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sume=0;
        int sumo=0;
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        while(n>0){
            int temp=n%10;
            if(temp%2==0) {
                sume = sume + temp;
            }else{
                sumo=sumo+temp;
            }
            n=n/10;
        }
        if(sume==0 || sumo==0) {
            System.out.println("The Discount is: " + (sumo * sume) * 0);
        }else{
            System.out.println("The Discount is: " + (sumo * sume));
        }
    }
}
