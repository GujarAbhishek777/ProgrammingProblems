package BasicProgramming__AbhishekGujar;
//WAP TO FIND ALL THE PRIME FACTORS OF THE GIVEN NUMBER
import java.util.Scanner;

public class P30PrimeFactorsofNo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of no : ");
        int n=sc.nextInt();
//        System.out.println("The factors of the number "+n+" are as follows:");
        for (int i=1;i<=n;i++){
            if(n%i==0){
                int count=0;
                for (int k=1;k<=i;k++){
                    if(i%k==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("Prime Factors : "+i);
                }
            }
        }
    }
}
