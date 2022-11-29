package Array__AbhishekGujar;
import java.util.Scanner;
//WAP TO FIND largest element in each row of the element
public class P34LargestElemntInEachRowOf2DArray {
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
        for (int i=0;i<a.length;i++){
            int max=a[i][0];
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
