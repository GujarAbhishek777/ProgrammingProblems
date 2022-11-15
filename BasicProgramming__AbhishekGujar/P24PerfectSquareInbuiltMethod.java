package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE PERFECT SQUARE NUMBERS BY USING INBUILT METHOD
import java.util.Scanner;

public class P24PerfectSquareInbuiltMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
//        Boolean flag=true;
        int n=sc.nextInt();
//        for (int i=1;i<=Math.sqrt(n);i++){
//            if(i*i==n){
//                System.out.println("Number is perfect Square");
//                flag=false;
//            }
//        }
//        if(flag){
//            System.out.println("Number is not a Perfect Square");
//        }


        double sqrt=Math.sqrt(n);
        if(sqrt==Math.floor(sqrt)){
            System.out.println("The Number is Perfect Square");
        }else{
            System.out.println("The Number is Not a Perfect Square");
        }

    }
}
