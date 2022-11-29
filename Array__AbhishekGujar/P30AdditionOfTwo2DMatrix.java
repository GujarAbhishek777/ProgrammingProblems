package Array__AbhishekGujar;
//WAP TO ADD TWO MATRICES
public class P30AdditionOfTwo2DMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,1,0},{0,0,2},{1,1,0}};
        int[][] c=new int[3][3];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
