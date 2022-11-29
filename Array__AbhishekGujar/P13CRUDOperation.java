package Array__AbhishekGujar;
//CRUD OPERATION PROGRAM GIVEN BY SIR
import java.util.Arrays;
import java.util.Scanner;

public class P13CRUDOperation {
    public static void main(String[] args) {
        int [] a={12,43,56,35,23};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please select the operation from below: ");
        System.out.println("1.Adding operation");
        System.out.println("2.Deletion operation");
        System.out.println("2.Updation operation");
        int s=sc.nextInt();
         int index;
         int element;
        switch (s){
            case 1:
                System.out.println("Please Enter element which you want to add:");
                 element=sc.nextInt();
                System.out.println("Please enter the index value: ");
                 index=sc.nextInt();
                a=add(element,index,a);
                System.out.println(Arrays.toString(a));
                break;
            case 2:
                System.out.println("Please enter the index value that you want to delete: ");
                 index=sc.nextInt();
                a=delete(index,a);
                System.out.println(Arrays.toString(a));
                break;
            case 3:
                System.out.println("Please Enter element which you want to update:");
                element=sc.nextInt();
                System.out.println("Please enter the index value: ");
                index=sc.nextInt();
                a=update(element,index,a);
                System.out.println(Arrays.toString(a));
                break;
        }
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
    public static int[] update(int element,int index,int[] a){
        if(index<0||index>=a.length){
            System.out.println("Invalid index ");
            return a;
        }
        a[index]=element;
        return a;
    }

}
