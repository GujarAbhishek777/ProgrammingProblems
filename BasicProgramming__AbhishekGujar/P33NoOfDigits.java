package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE NO OF DIGIT OF THE NUMBER
public class P33NoOfDigits {
    public static void main(String[] args) {
        int n=210920;
        int count=0;
        while(n!=0){
//           int temp=n%10;  NOT NEED TO WRITE THIS STATEMENT
           count++;
           n=n/10;
        }
        System.out.println(count);
    }
}
