package Array__AbhishekGujar;
//WAP TO FIND THE MAXIMUM PRODUCT OF TWO INTEGERS IN THE ARRAY
public class P25IMP09 {
    public static void main(String[] args) {
        int[] a={2,3,5,7,-7,5,8,-5};
        int max=Integer.MIN_VALUE;
        int n1=-1;
        int n2=-1;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]*a[j]>max){
                    max=a[i]*a[j];
                    n1=a[i];
                    n2=a[j];
                }
            }
        }
        System.out.println("The numbers are: "+n1+" "+n2);
        System.out.println("The product is: "+max);
    }
}
