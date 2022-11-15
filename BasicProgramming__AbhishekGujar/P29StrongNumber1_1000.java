package BasicProgramming__AbhishekGujar;
//WAP TO PRINT THE STRONG NUMBERS IN THE RANGE 1 TO 1000
public class P29StrongNumber1_1000 {
    public static void main(String[] args) {
        for (int k=1;k<=1000;k++) {
            int n = k;
            int check = n;
            int fsum = 0;
            while (n != 0) {
                int temp = n % 10;
                int prod = 1;
                for (int i = 1; i <= temp; i++) {
                    prod = prod * i;
                }
                fsum = fsum + prod;
                n = n / 10;
            }
            if (fsum == check) {
                System.out.println("The Number is Strong number:"+k);
            }
        }
    }
}

