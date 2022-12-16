package Pattern_AbhishekGujar;

public class P28_O {
    public static void main(String[] args) {
        int n=5;
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if((c==n && (r>1 && r<n))|| (c==1 && (r>1 && r<n)) || (r==1 && (c>1 && c<n)) || (r==n && (c>1 && c<n))){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
