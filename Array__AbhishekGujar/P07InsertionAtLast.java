package Array__AbhishekGujar;
//WAP TO ADD ELEMENT AT THE LAST OF ARRAY
import java.util.Arrays;

public class P07InsertionAtLast {
        public static void main(String[] args) {
            int []arr={20,15,27,25,43};
            int [] arr1=new int[arr.length+1];
            arr1[arr1.length-1]=25;
            System.out.println("The array before insertion");
            System.out.println(Arrays.toString(arr));
            for (int i=0;i<arr.length;i++){
                arr1[i]=arr[i];
            }
            System.out.println();
            System.out.println("The array after the insertion at last");

            System.out.println(Arrays.toString(arr1));
    }
}
