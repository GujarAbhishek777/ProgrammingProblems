package BasicProgramming__AbhishekGujar;

import java.util.Scanner;

//WAP TO PRINT THE NUMBER IS SPECIAL OR NOT
public class P22SpecialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int temp=n%10;
           sum=sum+temp;
           prod=prod*temp;
           n=n/10;
        }
        if((sum+prod)==a) {
            System.out.println("The number is a Special Number");
        }else{
            System.out.println("The number is not a Special Number");
        }
    }
}
