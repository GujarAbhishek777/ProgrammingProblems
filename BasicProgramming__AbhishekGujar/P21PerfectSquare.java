package BasicProgramming__AbhishekGujar;

import java.util.Scanner;

public class P21PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        boolean flag=true;

//        higher time complexity
//        for (int i=0;i<n;i++){
//            if(i*i==n){
//                System.out.println("Number is perfect Square");
//                flag=false;
//            }
//        }
//        if(flag){
//            System.out.println("Number is not a Perfect Square");
//        }
//  less time complexity
        for (int i=1;i*i<=n;i++){
            if(i*i==n){
                System.out.println("Number is perfect Square");
                flag=false;
            }
        }
        if(flag){
            System.out.println("Number is not a Perfect Square");
        }
    }
}
