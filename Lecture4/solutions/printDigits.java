import java.util.*;

public class printDigits {
    /* Digits Of A Number */
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Initially divisor will be 0
        int div = 1;
        // Storing n to temp variable
        int temp = n;
        // Creating required divisior
        while (temp >= 10) {
            temp /= 10;
            div *= 10;

        }
        // dividing until divisior is greater then 1
        while (div >= 1) {
            // q is the quotient and r is the divisior
            int q = n / div;
            int r = n % div;
            // printing digits by dividing with the required divisior
            System.out.println(q);
            // making current number as divisior
            n = r;
            div /= 10;
        }
    }
}