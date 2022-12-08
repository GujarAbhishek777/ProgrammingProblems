package Strings__AbhishekGujar;
//WAP TO PRINT THE STRING ARRAY ELEMENTS IN THE ALPHABETICAL(Lexographical) ORDER
import java.util.Arrays;

public class P19AlphabeticalOrderTheArrayOfString {
    public static void main(String[] args) {
        String[] arr={"Biryani","Tikka","Butter Chiken"};
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
