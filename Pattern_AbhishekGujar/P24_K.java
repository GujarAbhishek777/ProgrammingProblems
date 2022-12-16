package Pattern_AbhishekGujar;

public class P24_K {
    public static void main(String[] args) {
        int n=7;
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if(c==n/2+1 || (r==c && c>=n/2+1) || (r+c==n+1 && c>=n/2+1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
