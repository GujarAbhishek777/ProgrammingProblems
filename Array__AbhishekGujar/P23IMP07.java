package Array__AbhishekGujar;
//WAP TO FIND TRIPLET WHOSE SUM EQUAL TO NUMBER
public class P23IMP07 {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5};
       int n=9;
       for (int i=0;i<a.length;i++){
           for (int j=i+1;j<a.length;j++){
               for (int k=j+1;k<a.length;k++){
                   if(a[i]+a[j]+a[k]==n){
                       System.out.println(a[i]+" "+a[j]+" "+a[k]);
                   }
               }
           }
       }
    }
}
