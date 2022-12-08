package Strings__AbhishekGujar;
//WAP TO CONVERT ALL THE LOWERCASE CHARACTERS INTO UPPERCASE
import java.util.Scanner;

//BY USING THE ARRAY APPROACH
public class P09ZAnotherApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
//        System.out.println(arr);

        for (int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z')
            arr[i]=(char)(arr[i]-32);
        }
         str=new String(arr);
        System.out.println(str);
    }
}
