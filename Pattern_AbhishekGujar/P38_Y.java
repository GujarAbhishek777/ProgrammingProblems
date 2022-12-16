package Pattern_AbhishekGujar;

public class P38_Y {
    public static void main(String[] args) {
        int n=5;
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if((r==c && r<=n/2+1) || (r+c==n+1  && r<=n/2+1) || (c==n/2+1 && r>=n/2+1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
