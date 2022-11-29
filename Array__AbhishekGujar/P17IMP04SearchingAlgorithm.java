package Array__AbhishekGujar;
//IMP PROGRAM GIVEN BY SIR FOR SEARCHING ALGORITHM
import java.util.Scanner;

public class P17IMP04SearchingAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int [] abhi=new int[size];
        for (int i=0;i<abhi.length;i++){
            abhi[i]=sc.nextInt();
        }
        for (int k = 0; k < abhi.length; k++) {
            int n = abhi[k];
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }
//        double [] a={1,2,3,4,5,6,7,8,9,10};
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (Math.sqrt(a[i]) == Math.floor(Math.sqrt(a[i]))) {
                    count++;
                } else if (Math.cbrt(a[i]) == Math.floor(Math.cbrt(a[i]))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
