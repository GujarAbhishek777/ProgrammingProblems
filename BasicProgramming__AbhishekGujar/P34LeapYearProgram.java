package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE YEAR IS LEAP YEAR
public class P34LeapYearProgram {
    public static void main(String[] args) {
        int year=1582;
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("The year is leap year");
        }else{
            System.out.println("The number is not a leap year");
        }
    }
}
