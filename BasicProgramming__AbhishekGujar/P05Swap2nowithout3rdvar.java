package BasicProgramming__AbhishekGujar;
//WAP TO SWAP 2 NO WITHOUT USING 3RD VARIABLE
public class P05Swap2nowithout3rdvar {
    public static void main(String[] args) {
        int a=3,b=7;
        System.out.println("Before swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
