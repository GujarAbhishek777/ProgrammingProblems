package Strings__AbhishekGujar;
//WAP TO PRINT THE SPACES PRESENT IN THE GIVEN STRING
public class P06NoOfWideSpaces {
    public static void main(String[] args) {
        String str="How are you?";
        int count=0;
        for (int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
