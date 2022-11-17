package NumberConversion__AbhishekGujar;
//WAP TO CONVERT DECIMAL TO BINARY
public class P01BinaryProgram {
    public static void main(String[] args) {
        int n=14;
        String s="";
        while(n!=0){
            int r=n%2;
            s=r+s;
            n=n/2;
        }
        System.out.println(s);
    }
}
