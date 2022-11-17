package NumberConversion__AbhishekGujar;
//WAP TO CONVERT DECIMAL TO OCTAL
import java.util.Scanner;

public class P02Deci__Octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of no : ");
        int n=sc.nextInt();
        int temp=n;
        String s="";
        while(n!=0){
            int r=n%8;
            s=r+s;
            n=n/8;
        }
        System.out.println("The Octal No of "+temp+" is as: "+s);
    }
}
