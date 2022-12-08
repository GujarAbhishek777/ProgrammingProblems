package Strings__AbhishekGujar;
//WAP TO PRINT THE REVERSE OF THE GIVEN STRING
public class P03ReverseString {
    public static void main(String[] args) {
        String a="Thane";
        String res="";
        for (int i=a.length()-1;i>=0;i--){
            res=res+a.charAt(i);
        }
        System.out.println(res);
    }
}
