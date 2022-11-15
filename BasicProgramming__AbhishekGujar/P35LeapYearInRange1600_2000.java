package BasicProgramming__AbhishekGujar;

public class P35LeapYearInRange1600_2000 {
    public static void main(String[] args) {
        for(int year=1600;year<=2000;year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("The year is leap year :"+year);
            }
        }
    }
}
