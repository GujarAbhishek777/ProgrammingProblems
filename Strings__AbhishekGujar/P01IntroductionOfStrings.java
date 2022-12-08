package Strings__AbhishekGujar;
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//Using String Literal
//***************************************************
public class P01IntroductionOfStrings {
    public static void main(String[] args) {
        String s1="Bye";
        String s2="Bye";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//Using new Keyword
//************************************************
//public class P01IntroductionOfStrings {
//    public static void main(String[] args) {
//        String s1=new String("Hii");
//        String s2=new String("Hii");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//    }
//}
//#########################################################################################################
//*****************************Strings*******************************************************************
//1)String: It is a group of sequence of characters together but in java String is a class which is present inside
//java.lang package.
//2) It is a final class which extends Object class and implements three interfaces
// I)Charsequence   II)Comparable  III)Serializable
//3)String class is immutable
//*********************************************************************************************************
//4)There are two ways to create string object
//**********************************************************************************************************
//I)Using String Literal

//Syntax:
//String variable=String Literal;

//Whenever we create String object using String Literal The JVM first checks the STring constant pool
//Present in the heap area if any object with the same content is already present or not if not present
//then new object is created and address is return. if the object is already present then it will
// the address of the existing object.
//**********************************************************************************************************
//public class P01IntroductionOfStrings {
//    public static void main(String[] args) {
//        String s1="Bye";
//        String s2="Bye";
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//    }
//}
//Output:
//Bye
//Bye
//true
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//Q.Why do we use String Literal
//Answer:=> We use String Literal to save memory and make java more memoru  efficient Because no new
// object will be created.If it exist already in the String constant pool.

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//II)String object using new keyword

//Syntax: String variable =new String(StringLiteral);

//Whenever we create a string object using new keyword JVM will create new object in the heap area and
//If existing object is not present then new object in the scp(string constant pool) as well.
//Address of the object present in the heap area will be returned.

//*********************************************************************************************************

//public class P01IntroductionOfStrings {
//    public static void main(String[] args) {
//        String s1=new String("Hii");
//        String s2=new String("Hii");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//    }
//}
//Output:
//Hii
//Hii
//false
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
