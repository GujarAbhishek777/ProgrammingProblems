package NumberConversion__AbhishekGujar;
//WAP TO PRINT BINARY TO OCTAL
public class P03Binary_Octal {
    public static void main(String[] args) {
        int n=1100;
        int count=0;
        int res=0;
        while(n!=0){
            int temp=n%10;
            res=(pow(2,count)*temp)+res;
            n=n/10;
            count++;
        }
        System.out.println(octal(res));
    }
    public static int pow(int n,int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res=res*n;
        }
        return res;
    }

    public static String octal(int n){
        int res=0;
        String s="";
        while(n!=0){
            int r=n%8;
            s=r+s;
            n=n/8;
        }
        return s;
    }
}
