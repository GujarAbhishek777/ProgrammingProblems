package Strings__AbhishekGujar;
//WAP TO CONVERT INTEGER TO STRING
public class P12IntegerToString {
    public static void main(String[] args) {
        int a=12345;
        int b=54321;
        //first Method
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2);
        //Second Method
        String s3=a+"";
        String s4=b+"";
        System.out.println(s3+s4);
    }
}
