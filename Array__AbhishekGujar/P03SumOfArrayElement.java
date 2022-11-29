package Array__AbhishekGujar;
//WAP TO PRINT THE SUM OF ALL THE ELEMENTS OF THE ARRAY
import java.util.Scanner;

public class P03SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int [] a=new int[size];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the "+i+" element: ");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<a.length;i++){
           sum=sum+a[i];
        }
        System.out.println("The SUm of all the element is : "+sum);
    }
}
