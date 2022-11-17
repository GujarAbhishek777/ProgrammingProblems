package NumberConversion__AbhishekGujar;

public class P08Binary__Hexa {
    public static void main(String[] args) {
        int n=1111;
        int count=0;
        int res=0;
        while(n!=0){
            int temp=n%10;
            res=(pow(2,count)*temp)+res;
            n=n/10;
            count++;
        }
        System.out.println(hexa(res));
    }
    public static int pow(int n,int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res=res*n;
        }
        return res;
    }
    public static String hexa(int n){
        int temp=n;
        String s="";
        while(n!=0){
            int r=n%16;
            String k="o";
            boolean b=false;
            if(r==10){
                k="a";
                b=true;
            }else if(r==11){
                k="b";
                b=true;
            } else if (r==12) {
                k="c";
                b=true;
            } else if (r==13) {
                k="d";
                b=true;
            } else if (r==14) {
                k="e";
                b=true;
            } else if (r==15) {
                k="f";
                b=true;
            }
            if(b){
                s=k+s;
            }else{
                s=r+s;
            }
            n=n/16;
        }
        return s;
    }

}
