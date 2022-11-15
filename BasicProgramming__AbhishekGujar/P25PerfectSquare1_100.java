package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE PERFECT SQUARES FROM RANGE 1 TO 100
public class P25PerfectSquare1_100 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            for (int j=1;j*j<=i;j++){
                if(j*j==i){
                    System.out.println("Number is perfect Square : "+i);
                }
            }
        }
    }
}
