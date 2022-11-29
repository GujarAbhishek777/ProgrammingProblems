package Array__AbhishekGujar;
//WAP TO FIND THE PRODUCT OF ALL ELEMENTS IN ARRAY WHICH ARE DIVISIBLE BY 3
import java.util.Scanner;

public class P05ProductOfArrayElementsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int [] a=new int[size];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the "+i+" element: ");
            a[i]=sc.nextInt();
        }
        int prod=1;
        for (int i=0;i<a.length;i++){
            if(a[i]%3==0){
                prod=prod*a[i];
            }
        }
        System.out.println("The product of divisible by 3 is : "+prod);
    }
}
