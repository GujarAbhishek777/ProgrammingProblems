package Array__AbhishekGujar;
//ANOTHER APPROACH FOR THE SELECTION SORT
import java.util.Arrays;

public class P15ZAnotherApproach {
    public static void main(String[] args) {
        int[] a={3,5,1,2,4,4,0,10,10};
        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
