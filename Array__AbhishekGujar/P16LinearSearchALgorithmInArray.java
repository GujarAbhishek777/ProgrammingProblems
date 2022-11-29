package Array__AbhishekGujar;
//LINEAR SEARCH ALGORITHM FOR THE GIVEN ARRAY TO SARCH ELEMENT IN THE ARRAY
public class P16LinearSearchALgorithmInArray {
    public static void main(String[] args) {
        int [] a={2,4,3,5,1};
        int search=4;
        boolean flag=true;
        for (int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("The element present at index: "+i);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("The element is not present");
        }
    }
}
