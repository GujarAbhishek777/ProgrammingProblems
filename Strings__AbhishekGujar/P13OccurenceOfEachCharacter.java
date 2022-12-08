package Strings__AbhishekGujar;
////WAP TO FIND THE OCCURENCE OF EACH CHARACTER IN THE STRING
public class P13OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String s="maharashtra";
        char[] a=s.toCharArray();
        boolean[] b=new boolean[a.length];
        for (int i=0;i<a.length;i++){
            if(b[i]==false){
                int count=1;
                for (int j=i+1;j<b.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        b[j]=true;
                    }
                }
                System.out.println(a[i]+" "+count);
            }
        }
    }
}
