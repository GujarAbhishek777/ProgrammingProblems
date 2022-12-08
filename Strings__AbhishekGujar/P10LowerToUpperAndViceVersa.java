package Strings__AbhishekGujar;

import java.util.Scanner;

//WAP TO CONVERT ALL LOWERCASE CHARACTERS TO UPPERCASE AND UPPERCASE CHARACTERS TO LOWERCASE
public class P10LowerToUpperAndViceVersa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();

        for (int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z') {
                arr[i] = (char) (arr[i] - 32);
            } else if (arr[i]>='A' && arr[i]<='Z') {
                arr[i]=(char)(arr[i]+32);
            }
        }
        str=new String(arr);
        System.out.println(str);
    }
}
