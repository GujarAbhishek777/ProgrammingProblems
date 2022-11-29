package Array__AbhishekGujar;
//FIND THE LARGEST ELEMENT IN THE ARRAY
public class P10LargestElementFromArray {
    public static void main(String[] args) {
        int[] a={5,7,1,9,13};
        int large=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        System.out.println("The Maximum Element is: "+large);
    }
}
