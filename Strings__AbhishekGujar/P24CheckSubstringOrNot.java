package Strings__AbhishekGujar;
//WAP TO CHECK ON GIVEN STRING IS SUBSTRING OF ANOTHER STRING OR NOT
public class P24CheckSubstringOrNot {
    public static void main(String[] args) {
        String str="AbhishekGujar";
        String s="Gujar";
        if(str.contains(s)){
            System.out.println("The string contains the substring");
        }else{
            System.out.println("The string does not contain the given string");
        }

    }
}
