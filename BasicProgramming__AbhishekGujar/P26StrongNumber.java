package BasicProgramming__AbhishekGujar;
//WAP TO CHECK THE GIVEN NUMBER IS STRONG NUMBER OOR NOT
public class P26StrongNumber {
    public static void main(String[] args) {
        int n=145;
        int check=n;
        int fsum=0;
        while (n!=0){
            int temp=n%10;
            int prod=1;
           for (int i=1;i<=temp;i++){
               prod=prod*i;
           }
           fsum=fsum+prod;
           n=n/10;
        }
        if(fsum==check){
            System.out.println("The Number is Strong number");
        }else{
            System.out.println("Number is not strong number");
        }
    }
}
