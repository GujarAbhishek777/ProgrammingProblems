package Array__AbhishekGujar;
//WAP TO MAKE ALL THE ELEMENTS OF THE ARRAY DIVISIBLE BY K BY PERFORMING
//DECREMENT OPERATION pRINT THE TOTAL NUMBER NO OF DECREMENT
import java.util.Scanner;

public class P22IMP06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Please enter elements of array");
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
       for (int i=0;i<n;i++){
           int rem=a[i]%k;
           sum=sum+rem;
       }
        System.out.println("The number of decrement is: "+sum);
    }
}
