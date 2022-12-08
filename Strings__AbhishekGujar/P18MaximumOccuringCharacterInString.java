package Strings__AbhishekGujar;
//WAP TO FIND THE MAXIMUM OCCURING CHARACTER IN THE STRING
public class P18MaximumOccuringCharacterInString {
    public static void main(String[] args) {
        String s="maharashtra";
        char[] a=s.toCharArray();
        boolean[] b=new boolean[a.length];
        int max=Integer.MIN_VALUE;
        int index=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(b[i]==false){
                int count=1;
                for (int j=i+1;j<b.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if (count>max) {
                    max=count;
                    index=i;
                }
            }
        }
        System.out.println("The Max Occurence element is "+a[index]+" and it is repeated "+max+" times");
    }
}
