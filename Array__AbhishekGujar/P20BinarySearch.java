package Array__AbhishekGujar;
//BINARY SEARCH ALGORITHM
public class P20BinarySearch {
    public static void main(String[] args) {
        int search=9;
        int[] a={1,2,3,4,5};
        int s=0;
        int e=a.length-1;
        int mid=(e+s);
        while(s<=e){
            if(search==a[mid]){
                System.out.println("The element present at the index: "+mid);
                break;
            }else if(search>a[mid]){
                s=mid+1;
            }else if(search<a[mid]){
                e=mid-1;
            }
            mid=(s+e)/2;
        }
        if(s>e){
            System.out.println("The element is not found in the array");
        }
    }
}
