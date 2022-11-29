package Array__AbhishekGujar;
//WAP TO DELETION IN THWE ARRAY
import java.util.Arrays;

public class P09DeletionOfElementFromArray {
    public static void main(String[] args) {
        int[] a={1,0,3,4};
        System.out.println(Arrays.toString(a));
        a=delete(1,a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] delete(int index,int[] a){
        if(index<0|| index>=a.length){
            System.out.println("Not a valid Input");
            return a;
        }
        int[] b=new int[a.length-1];
        for (int i=0;i<a.length-1;i++){
            if(i<index){
                b[i]=a[i];
            }else{
                b[i]=a[i+1];
            }
        }
        return b;
    }
}
