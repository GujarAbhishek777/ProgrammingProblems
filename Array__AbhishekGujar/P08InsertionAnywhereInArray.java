package Array__AbhishekGujar;
//WAP TO ADD ELEMENT IN THE ARRAY I.E.INSERTION IN THE ARRAY

import java.util.Arrays;

public class P08InsertionAnywhereInArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
//        int b[]=new int[a.length+1];
        System.out.println(Arrays.toString(a));
        a=add(11, 2, a);
//        System.out.println(Arrays.toString(a));
//       a=add(9,15,a)
        System.out.println(Arrays.toString((a)));
    }

    public static int[] add(int element,int index, int[] a){
        if(index<0|| index>a.length){
            System.out.println("Not a valid Input");
            return a;
        }
        int[] b=new int[a.length+1];
        b[index]=element;
        for (int i=0;i<b.length-1;i++){
            if(i<index){
                b[i]=a[i];
            }else{
                b[i+1]=a[i];
            }
        }
        return b;
    }
}
