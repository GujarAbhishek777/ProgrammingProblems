package Strings__AbhishekGujar;
//WAP TO FIND THE OCCURENCE OF EACH CHARACTER IN THE STRING
public class P13AnotherApproach {
    public static void main(String[] args) {
        String str="maharashtra";
        char[] a=str.toCharArray();
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            int count=0;
            for (int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    i=j;
                }
            }
            System.out.println("The character "+a[i]+" occurs "+count+" times");
        }
    }
}
