package BasicProgramming__AbhishekGujar;
//WAP TO SWAP 2 VARIABLES USING 3RD VARIABLE
public class P04Swap2no {
    public static void main(String[] args) {
        int a=3,b=7;
        System.out.println("Before swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
