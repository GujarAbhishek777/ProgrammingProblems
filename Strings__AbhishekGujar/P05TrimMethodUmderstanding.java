package Strings__AbhishekGujar;
//To understand the trim method
public class P05TrimMethodUmderstanding {
    public static void main(String[] args) {
        String str="   Nayan";
        str=str.trim();
        String res="";
        for (int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        //It checks the case also
//        if(res.equals(str))
        //It did not checks the case of string
        if (res.equalsIgnoreCase(str))
        {
            System.out.println("The string is Palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }

    }
}
