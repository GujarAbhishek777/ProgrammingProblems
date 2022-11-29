package Array__AbhishekGujar;
//WAP TO FIND ROWNO AND COLUMNNO OF ELEMENT PRESENT IN THE MATIX AND CALCULATE THE SUM OF ROWNO AND COLUMNNO
//IF SUM IS EVEN CALCULATE THE SUM OF DIGITS OF ALL THE EVEN NUMBERS PRESENT IN THE ARRAY OTJERWISE CALCULATE THE SUM
//OF ALL THE SUM OF DIGITS OF ODD NUMBERS PRESENT IN THE ARRAY
import java.util.Scanner;

public class P33IMP11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the sixe of the square array");
        int size=sc.nextInt();
        int[][] a=new int[size][size];
        System.out.println("Start enetring the elements of the array");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
//        int[][] a={{11,22,33},{44,55,66},{77,88,99}};
        System.out.println("Please write element to be search: ");
        int search=sc.nextInt();
        int sum=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(search==a[i][j]){
                    sum=i+j+2;
                    break;
                }
            }
        }
        int sume=0;
        int sumo=0;
        if(sum%2==0){
            for (int i=0;i<a.length;i++){
                for (int j=0;j<a[i].length;j++){
                    if(a[i][j]%2==0){
                        int n=a[i][j];
                        while(n!=0){
                            int temp=n%10;
                             sume=sume+temp;
                            n=n/10;
                        }
                    }
                }
            }
            System.out.println("The sum of even digits is :"+sume);
        }else{
            for (int i=0;i<a.length;i++){
                for (int j=0;j<a[i].length;j++){
                    if(a[i][j]%2!=0){
                        int n=a[i][j];
                        while(n!=0){
                            int temp=n%10;
                            sumo=sumo+temp;
                            n=n/10;
                        }
                    }
                }
            }
            System.out.println("The sum of even digits is :"+sumo);
        }
    }
}
