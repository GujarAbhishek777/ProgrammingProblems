package Array__AbhishekGujar;
//WAP TO PRINT THE  ALL ELEMENTS OF ARRAY WHICH ARE EVEN NUMBERS
import java.util.Scanner;

public class P04EvenNumbersFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int [] a=new int[size];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the "+i+" element: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
