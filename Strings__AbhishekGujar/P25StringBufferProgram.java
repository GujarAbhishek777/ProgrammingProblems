package Strings__AbhishekGujar;
//********************STRINGBUFFER*****************

//1)It is class used to create string objects.
//2)All the string buffer objects are mutable. and It is synchronised i.e, Thread Safe

//There are five main methods in the stringbuffer

public class P25StringBufferProgram {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java ");
        System.out.println(sb);
        sb.append("is a programming language");
        System.out.println(sb);
        sb.insert(10,"high level ");
        System.out.println(sb);
        sb.delete(21,33);
        System.out.println(sb);
        sb.replace(0,4,"Python");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
