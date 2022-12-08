package Strings__AbhishekGujar;
//WAP TO CHECK TWO STRINGS ARE ROTATION OF EACH OTHER
public class P22RotationOfStrings {
    public static void main(String[] args) {
        String str1="Abhishek";
        String str2="shekAbhi";
//
//        char[] a1=str1.toCharArray();
//        char[] a2=str2.toCharArray();
//        int index=0;
//        for (int i=0;i<str2.length();i++){
//            if(str2.charAt(i)==str1.charAt(0)){
//                index=i;
//                break;
//            }
//        }
//      String res=str2.substring((index),(str2.length()-1))+str2.substring(0,index-1);
//        if(res.equals(str1)){
//            System.out.println("Rotation");
//        }else{
//            System.out.println("Not Rotation");
//        }

        if(str1.length()==str2.length()){
            str1=str1+str1;
            if(str1.indexOf(str2)!=-1){
                System.out.println("The Strings are Rotation");
            }else{
                System.out.println("The stringsare not Rotation");
            }
        }else{
            System.out.println("Lenght are not same");
        }

    }
}
