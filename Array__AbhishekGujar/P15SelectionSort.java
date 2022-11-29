package Array__AbhishekGujar;
//PROGRAM FOR THE SELECTION SORT
public class P15SelectionSort {
    public static void main(String[] args) {
        int arr[]={6,2,9,4,9,1};
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            int smallest=i;
            for (int j=i+1;j<l;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
        for (int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
