package Array__AbhishekGujar;
//WAP TO UPDATION IN THE ARRAY
import java.util.Arrays;

public class P09UpdationOfArray {
    public static void main(String[] args) {
       int[] a={1,0,3,4};
        System.out.println(Arrays.toString(a));
        a=update(1,2,a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] update(int index,int element,int[] a){
        if(index<0||index>=a.length){
            System.out.println("Invalid index ");
            return a;
        }
        a[index]=element;
        return a;
    }
}
