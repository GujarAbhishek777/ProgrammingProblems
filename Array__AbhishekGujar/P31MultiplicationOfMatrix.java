package Array__AbhishekGujar;
//MULTIPLICATION OF THE TWO MATRIX
public class P31MultiplicationOfMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,1,0},{0,0,2},{1,1,0}};
        int[][] c=new int[3][3];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i].length;k++) {
                    c[i][j] =c[i][j]+a[i][k]*b[k][j];
                }
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
