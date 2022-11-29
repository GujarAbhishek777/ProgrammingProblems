package Array__AbhishekGujar;
//IMP QUESTION GIVEN BY SIR
import java.util.Arrays;

public class P18IMP05 {
    public static void main(String[] args) {
        int[] a={0,4,0,0,1,3,4,1,0,2};
//        int [] b=a;
        int [] b=new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
//        System.out.println(b[1]);
        System.out.println(Arrays.toString(a));

        for (int i=0;i<b.length;i++){
            for (int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(b));
        int goodsum=0;
        int badsum=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                goodsum = goodsum + a[i];
            }else{
                badsum=badsum+a[i];
            }
        }
        System.out.println(goodsum);
        System.out.println(badsum);
        System.out.println(badsum-goodsum);
    }
}
