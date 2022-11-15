package BasicProgramming__AbhishekGujar;
//WAP TO FIND PRODUCT OF ALL NUMBERS IN RANGE OF 1 TO 7
public class P02Productinrange {
    public static void main(String[] args) {
        int prod=1;
        for(int i=1;i<=7;i++){
            prod=prod*i;
        }
        System.out.println(prod);
    }
}
