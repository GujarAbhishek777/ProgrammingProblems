package BasicProgramming__AbhishekGujar;
//WAP TO FIND 1) SUM OF ALL DIGITS DIVISIBLE BY FIRST DIGIT
// 2) CHECK IF ODD DIGIT IS PRESENT
// 3) DIFF BETWEEN SUM OF ODD DIGIT AND SUM OF EVEN DIGIT IN THE NUMBER
public class P31IMP3 {
    public static void main(String[] args) {
       int n=2345;
        System.out.println(sum(n));
        System.out.println(odddig(n));
        System.out.println(diff(n));
    }

    public static String sum(int n){
        int sum=0;
        int d=0;
        while(n!=0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(sum%d==0){
            return "yes";
        }else{
            return "no";
        }
    }

    public static String odddig(int n){

        while(n!=0){
            int temp=n%10;
            if(temp%2!=0){
                return "yes";
            }
            n=n/10;
        }
        return "no";
    }

    public static int diff(int n){
        int evensum=0;
        int oddsum=0;

        while(n!=0){
            int temp=n%10;
            if(temp%2==0){
                evensum=evensum+temp;
            }else{
                oddsum=oddsum+temp;
            }
            n=n/10;
        }
        return oddsum-evensum;
    }
}
