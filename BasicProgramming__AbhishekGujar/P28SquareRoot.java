package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE SQUARE ROOT OF THE NUMBER
public class P28SquareRoot {
    public static void main(String[] args) {
        int n=10;
        double t;
        double sqrt=n/2;

        do{
            t=sqrt;
            sqrt=(t+(n/t))/2;
        }while (t!=sqrt);

        System.out.println("The Square Root of Number is: "+sqrt);
    }
}
