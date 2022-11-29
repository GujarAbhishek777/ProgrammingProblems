package Array__AbhishekGujar;

import java.util.Arrays;

//WAP TO PRINT THE 2D ARRAY
public class P27_2DArrayPrint {
    public static void main(String[] args) {
       int[][] a={{1,2,3},{4,5,6,7},{8,9}};
       for (int i=0;i<a.length;i++){
           for (int j=0;j<a[i].length;j++){
               System.out.println(a[i][j]);
           }
//           System.out.println(Arrays.toString(a[i]));
       }
    }
}
