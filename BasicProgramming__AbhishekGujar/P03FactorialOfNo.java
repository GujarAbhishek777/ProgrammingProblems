package BasicProgramming__AbhishekGujar;

public class P03FactorialOfNo {
    public static void main(String[] args) {
       for (int j=5;j<=10;j++){
           int prod=1;
           for(int i=1;i<=j;i++) {
               prod = prod * i;
           }
               System.out.println("Factorial of "+j+" is "+prod);
       }
    }
}
