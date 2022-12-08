package Strings__AbhishekGujar;
//WAP TO REVERESE THE POSITION OF THE WORDS
public class P15ReverseStringWithSplitMethod {
    public static void main(String[] args) {
        String str="Welcome to Jspiders";
        String[] a=str.split(" ");
        for (int i= a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
