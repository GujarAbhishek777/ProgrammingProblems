package Array__AbhishekGujar;
//WAP TO FIND THE MISSING INTEGER FROM THE ARRAY OF RANGE 1 TO N WHERE ALL THE ELEMENTS ARE RANDOMLY STORED
public class P26IMP10 {
    public static void main(String[] args) {
        int n=6;
        int[] a={6,3,5,1,2};
        int sum1=0;
        int sum2=0;
     for (int i=1;i<=n;i++){
         sum1=i+sum1;
     }
     for (int i=0;i<a.length;i++){
         sum2=sum2+a[i];
     }
        System.out.println("The missing element is: "+(sum1-sum2));
    }
}
