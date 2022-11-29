package Array__AbhishekGujar;
//ANOTHER APPROACH FOR THE P17 PROGRAM
import java.util.Scanner;

public class P17AAnotherApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter size od The Array");
        int q=sc.nextInt();
        int [] a=new int[q];
        System.out.println("Please enter elements of Array:");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            int count=0;
            for (int j=1;j<=a[i];j++){
                if(isPerfectSquare(j)){
                    count++;
                } else if (isPerfectCube(j)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPerfectSquare(int n){
        for (int i=1;i*i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectCube(int n){
        for (int i=1;i*i*i<=n;i++){
            if(i*i*i==n){
                return true;
            }
        }
        return false;
    }
}
