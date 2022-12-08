package Strings__AbhishekGujar;
//WAP TO FIND THE STRING WITH LONGEST LENGTH IN THE ARRAY
public class P21LongestLengthStringInArray {
    public static void main(String[] args) {
        String[] str={"Abhishek","Raushani","Anand","Bhushan","Adika"};
        int max=Integer.MIN_VALUE;
        String largest="";
        for (int i=0;i<str.length;i++){
            if(str[i].length()>max){
                largest=str[i];
                max=str[i].length();
            }
        }
        System.out.println("The largest string is "+largest+" and its length is "+max);
    }
}
