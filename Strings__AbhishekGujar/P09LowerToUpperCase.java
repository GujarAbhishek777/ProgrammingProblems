package Strings__AbhishekGujar;
//WAP TO CONVERT STRING INTO UPPERCASE FORM
import java.util.Scanner;

public class P09LowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String str=sc.nextLine();
        String res;

        res=str.toUpperCase();
        System.out.println("The UpperCase String is as Follows: ");
        System.out.println(res);

    }
}
