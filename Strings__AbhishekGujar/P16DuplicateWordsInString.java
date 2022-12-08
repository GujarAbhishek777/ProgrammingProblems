package Strings__AbhishekGujar;
//WAP TO FIND ALL THE DUPLICATE WORDS IN THE SENTENCE
public class P16DuplicateWordsInString {
    public static void main(String[] args) {
        String str="Java is Programming language it is used to do Programming";
        String[] a=str.split(" ");
        boolean[] b=new boolean[a.length];
        for (int i=0;i<a.length;i++){
            if(b[i]==false){
                int count=1;
                for (int j=i+1;j<b.length;j++){
                    if(a[i].equals(a[j])){
                        count++;
                        b[j]=true;
                    }
                }
                if (count>1) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
