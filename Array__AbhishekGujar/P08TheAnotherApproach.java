package Array__AbhishekGujar;
//WAP TO ADD ELEMENT IN THE ARRAY I.E.INSERTION IN THE ARRAY
import java.util.Arrays;
import java.util.Scanner;

public class P08TheAnotherApproach {
    public static void main(String[] args) {
        int[] a={18,34,25,37,18};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element that you want to add: ");
        int n=sc.nextInt();
        System.out.println("'Enter the position of the element reffering index values: ");
        int position=sc.nextInt();
        if(position==0){
            System.out.println(Arrays.toString(addToStart(n,a)));
        } else if (position==a.length) {
            System.out.println(Arrays.toString(addToLast(n,a)));
        }else{
            if(position<0|| position>a.length-1){
                System.out.println("Not a valid Input");
            }else {
                System.out.println(Arrays.toString(addAtMiddle(n, a, position)));
            }
        }
    }

    public static int[] addToStart(int element ,int[] a){
        int[] b=new int[a.length+1];
        b[0]=element;
        for (int i=0;i<a.length;i++){
            b[i+1]=a[i];
        }
        return b;
    }

    public static int[] addToLast(int element ,int[] a){
        int[] b=new int[a.length+1];
        b[b.length-1]=element;
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        return b;
    }
    public static int[] addAtMiddle(int element,int[] a,int position){
        int[] b=new int[a.length+1];
        for (int i=0;i<position;i++){
            b[i]=a[i];
        }
        b[position]=element;
        for (int i=position;i<a.length;i++){
            b[i+1]=a[i];
        }
        return b;
    }

}
