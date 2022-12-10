package Pattern_AbhishekGujar;

//        *       *
//        *       *
//        *   *   *
//        * *   * *
//        *       *
public class P13 {
    public static void main(String[] args) {
        int n=5;
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if(c==1 || c==5 || (r>=3 && r==c)|| (r>=3 && r+c==n+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
