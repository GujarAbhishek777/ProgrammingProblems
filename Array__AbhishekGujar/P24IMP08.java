package Array__AbhishekGujar;
//WAP TO FIND THE AVERAGE OF THE ARRAY ELEMENTS
public class P24IMP08 {
    public static void main(String[] args) {
        int[] a={1,3,5,2,6,7};
        float sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("The average of array element is : "+(sum/a.length));
    }
}
