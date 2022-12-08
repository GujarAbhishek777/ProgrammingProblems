package Strings__AbhishekGujar;
//WAP TO PRINT THE ONLY NUMBERS PRESENT IN THE GIVEN STRING
public class P20PrintNumbersFromString {
    public static void main(String[] args) {
        String str="Sumal@0123sgsj42fns252";
        char[] a=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(a[i]>=48 && a[i]<57){
                System.out.println(a[i]);
            }
        }
    }
}
