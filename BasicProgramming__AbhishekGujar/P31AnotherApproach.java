package BasicProgramming__AbhishekGujar;
//WAP TO FIND 1) SUM OF ALL DIGITS DIVISIBLE BY FIRST DIGIT
// 2) CHECK IF ODD DIGIT IS PRESENT
// 3) DIFF BETWEEN SUM OF ODD DIGIT AND SUM OF EVEN DIGIT IN THE NUMBER
public class P31AnotherApproach {
    public static void main(String[] args) {
        int n=2468;
        int evensum=0;
        int oddsum=0;
        int temp=0;
        while(n!=0){
             temp=n%10;
            if(temp%2==0){
                evensum=evensum+temp;
            }else{
                oddsum=oddsum+temp;
            }
            n=n/10;
        }
        System.out.println("Sum of all digit divisible by first digit : "+((evensum+oddsum)%temp==0));
        System.out.println("The Odd digit is present in Number: "+(oddsum!=0));
        System.out.println("The diff between osum of odd and even digit is: "+(oddsum-evensum));
    }
}
