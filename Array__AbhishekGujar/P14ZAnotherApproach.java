package Array__AbhishekGujar;
//ANOTHER APPROACH FOR THE BUBBLE SORT
import java.util.Arrays;

public class P14ZAnotherApproach {
    public static void main(String[] args) {
        int[] a={3,5,4,2,1,5,5};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
