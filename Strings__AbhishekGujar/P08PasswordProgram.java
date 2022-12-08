package Strings__AbhishekGujar;

import java.util.Scanner;

//WAP TO CHECK THE GIVEN PASSWORD IS STRONG OR NOT
public class P08PasswordProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password=sc.nextLine();
        boolean isUpper=false;
        boolean isLower=false;
        boolean isNumeric=false;
        boolean isSpecial=false;

        for (int i=0;i<password.length();i++){
            if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                isUpper=true;
            } else if (password.charAt(i)>='a' && password.charAt(i)<='z') {
                isLower=true;
            } else if (password.charAt(i)>='0' && password.charAt(i)<='9') {
                isNumeric=true;
            } else {
                isSpecial=true;
            }
        }
        if (isUpper && isLower && isNumeric && isSpecial && password.length()>=8){
            System.out.println("The given password is Strong Password");
        }else{
            System.out.println("The given password is not a Strong password");
        }
    }
}
