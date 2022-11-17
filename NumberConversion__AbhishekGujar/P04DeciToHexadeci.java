package NumberConversion__AbhishekGujar;
//WAP TO CONVERT DECIMAL TO HEXADECIMAL
import java.util.Scanner;

public class P04DeciToHexadeci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of no : ");
        int n=sc.nextInt();
        int temp=n;
        String s="";
        while(n!=0){
            int r=n%16;
            String k="o";
            boolean b=false;
            if(r==10){
                k="a";
                b=true;
            }else if(r==11){
                k="b";
                b=true;
            } else if (r==12) {
                k="c";
                b=true;
            } else if (r==13) {
                k="d";
                b=true;
            } else if (r==14) {
                k="e";
                b=true;
            } else if (r==15) {
                k="f";
                b=true;
            }
            if(b){
                s=k+s;
            }else{
            s=r+s;
            }
            n=n/16;
        }
        System.out.println(s);
    }
}
