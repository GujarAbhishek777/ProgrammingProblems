package Array__AbhishekGujar;
//WAP TO FIND THE SECOND LARGEST ELEMENT FROM THE ARRAY ANOTHER APPROACH
public class P12ZAnotherApproach {
    public static void main(String[] args) {
        int[] a={5,7,1,9,13,11,45,26,24,75,49};
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]>slarge && a[i]!=large){
                slarge=a[i];
            }
        }
        System.out.println("The second  Maximum Element is: "+slarge);
    }
}
