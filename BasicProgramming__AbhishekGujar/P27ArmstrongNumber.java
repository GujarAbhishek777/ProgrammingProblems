package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE GIVEN NUMBER IS THE ARMSTRONG NUMBER OR NOT
public class P27ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int check=n;
        int sum=0;
       int no=n;
        int count=0;
        while(n!=0){
//           int temp=n%10;  NOT NEED TO WRITE THIS STATEMENT
            count++;
            n=n/10;
        }
        while(no!=0){
            int temp=no%10;
            int cube=1;
            for (int i=1;i<=count;i++){
                cube=cube*temp;
            }
            sum=sum+cube;
            no=no/10;
        }
        if(sum==check){
            System.out.println("The Number is Armstrong Number");
        }else{
            System.out.println("The Number is not a Armstrong Number");
        }
    }
}
