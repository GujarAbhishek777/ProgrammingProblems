package Array__AbhishekGujar;
//FIND THE SMALLEST ELEMENT IN THE ARRAY
public class P11SmallestElementFromArray {
    public static void main(String[] args) {
        int[] a={5,7,1,9,13};
        int min=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The Maximum Element is: "+min);
    }
}
