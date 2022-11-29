package Array__AbhishekGujar;
//ANOTHER APPROACH OF INSERTION ALGORITHM
import java.util.Arrays;

public class P19AAnotherApproach {
    public static void main(String[] args) {
        int[] a={4,2,5,3,1};
        for (int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && temp<a[j-1]){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
