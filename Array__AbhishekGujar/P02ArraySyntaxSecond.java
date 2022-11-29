package Array__AbhishekGujar;

import java.util.Scanner;

public class P02ArraySyntaxSecond {
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
            System.out.print(a[i]);
        }
    }
}
