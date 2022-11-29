package Array__AbhishekGujar;

public class P31AnotherApproach {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 1, 0}, {0, 0, 2}, {1, 1, 0}};
        int[][] c = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j]=0;
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
