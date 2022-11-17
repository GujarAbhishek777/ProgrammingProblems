package NumberConversion__AbhishekGujar;

public class P06Octal_to_Decimal {
    public static void main(String[] args) {
        int n=14;
        int count=0;
        int res=0;
        while(n!=0){
            int temp=n%10;
            res=(pow(8,count)*temp)+res;
            n=n/10;
            count++;
        }
        System.out.println(res);
    }
    public static int pow(int n,int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res=res*n;
        }
        return res;
    }
}
