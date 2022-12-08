package Strings__AbhishekGujar;

public class P26StringTheoryQue {
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//Q.DIFFERENCE BETWEEN STRING AND STRINGBUFFER

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//#####String#####//
//1)String class is immutable
//2)String class is slow consumes more memory when we concatenate too many strings because every time it
//creates new object.
//3)String class overrides the equals method of Object class
//4)String class uses String Constant Pool
//********************************************
//#####StringBuffer#####//
//1)StringBuffer class is mutable
//2)StringBuffer is fast and consumes less memory when we concatenate too many Strings.
//3)StringBuffer doesn't override equals method of Object class.
//4)StringBuffer class uses Heap Area

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//Q.Difference Between StringBuffer And StringBuilder

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//#####StringBuffer#####//
//1)StringBuffer is Sychronised i.e, Thread Safe.It means two threads can't call same method of
//StringBuffer simultaneously.
//2)StringBuffer is less efficeient than StringBuilder
//3)StringBuffer is introduced in java 1.0
//****************************************************
//#####StringBuilder#####//
//1)StringBuilder is non-Synchronised i.e, not-Thread safe,. It means two threads can call the methods
//of StringBuilder Simultaneously.
//2)StringBuilder is more efficeint than StringBuffer
//3)StringBuilder is introduced in 1.2

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//Q.How can we make the class Immutable

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//STEP:01:  Make the class as final
//STEP:02: All the members should be private and final
// STEP:03:  To access the data members create only getter Members

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@