package Array__AbhishekGujar;
//WAP TO CONVERT YOUR NAME INTO ASCENDING ORDER WITH THEIR CHARACTER
import java.util.Arrays;

public class P21NameCharacterSort {
    public static void main(String[] args) {
        char[] a={'a','b','h','i','s','h','e','k'};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
