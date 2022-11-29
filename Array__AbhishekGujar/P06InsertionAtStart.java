package Array__AbhishekGujar;
//WAP TO ADD ELEMENT AT THE START OF THE ARRAY
import java.util.Arrays;

public class P06InsertionAtStart {
    public static void main(String[] args) {
        int []arr={20,15,27,25,43};
        int [] arr1=new int[arr.length+1];
        arr1[0]=25;
        System.out.println("The array before insertion");
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            arr1[i+1]=arr[i];
        }
        System.out.println();
        System.out.println("The array after the insertion at starting");

//        for (int i=0;i<arr1.length;i++){
//            System.out.print(arr1[i]+" ");
//        }

        System.out.println(Arrays.toString(arr1));
    }
}
