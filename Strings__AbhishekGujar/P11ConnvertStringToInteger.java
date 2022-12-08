package Strings__AbhishekGujar;
//WAP TO CONVERT STRING INTO INTEGER
public class P11ConnvertStringToInteger {
    public static void main(String[] args) {
        String s1="10";
        String s2="20";

        System.out.println(s1+s2);
        //Parsing methods are as follows for converting the String into any other datatype
        //If we enter any wrong input then it will give us NumberFormatException
//          Byte.parseByte();
//          Short.parseShort();
//          Integer.parseInt();
//          Float.parseFloat();
//          Long.parseLong();
//          Double.parseDouble();

        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        System.out.println(a+b);
    }
}
