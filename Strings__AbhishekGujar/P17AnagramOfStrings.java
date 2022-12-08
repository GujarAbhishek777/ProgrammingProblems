package Strings__AbhishekGujar;
//WAP TO PRINT THE GIVEN TWO STRINGS ARE ANGRAMS OR NOT

public class P17AnagramOfStrings {
    public static void main(String[] args) {
        String s1="cat";
        String s2="act";

        if(s1.length()==s2.length()){
            char[] a1=s1.toCharArray();
            char[] a2=s2.toCharArray();
//            Arrays.sort(a1);
//            Arrays.sort(a2);
            sorting(a1);
            sorting(a2);
            boolean check=true;
            for (int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    check=false;;
                    break;
                }
            }

            if(check){
                System.out.println("The given Strings are Anagrams");
            }else{
                System.out.println("The given Strings are not Anagrams");
            }


        }else{
            System.out.println("The given Strings are not anagram");
        }

    }

    public static char[] sorting(char[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
