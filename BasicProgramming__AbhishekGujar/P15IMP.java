package BasicProgramming__AbhishekGujar;

import java.util.Scanner;

//WAP TO CHECK EVEN OR ODD IF IT IS EVEN CHECK WHETHER THE NUMBER IS PERFECT NUMBER OR NOT
//IF ODD CHECK WHETHER NUMBER IS PRIME OR NOT
public class P15IMP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int n=sc.nextInt();
        if(n%2==0){
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

        }else{
            int count=0;
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
}
