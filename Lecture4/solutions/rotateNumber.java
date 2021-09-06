import java.util.*;

public class rotateNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int digits = 0;
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        //Counting digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        /*
        Consider 12345
        and k = 3 it means rotate it 3 to the right because is +ve let's analyze it
        for k = 1 : 51234
        for k = 2 : 45123
        for k = 3 : 34512 //It's our answer as per k = 3
        for k = 4 : 23451
        for k = 5 : 12345
        for k = 6 : 51234
        here we can conclude that 6 is same as 1 and surely 7 is same as 2
        so we can take k = k%digits

        Let's try this for negative numbers as well
        k = -3 it means rotate it to the left because it's -ve
        k = -1  : 23451
        k = -2  :  34512
        k = -3  : 45123
        k =- 4  : 51234
        k = -5  : 12345
        k = -6 : 23451
        See here also values are repeating 
        and see -5 is same as 5 and 5 is same as 0
        and -1 is same as 4 and so on
        digits = 5 right
        so we can solve it for +ve k
        we can covert -1 as k = digits - k
        5 - 1 == 4

        */
        k = k % digits;
        if (k < 0) {
            k *= -1;
            k = digits - k;
        }
        //Consider this example 
        /*12345 and k = 3
        so we divide it by 10^3 and get
        remainder as 345 and quotient as 12
        we want 34512
        multiply 345 with 10^(digits-k) == 10^2
        34500 
        now we want quotient to the end right
        34500 + q == 34512
        */
        int div = (int) Math.pow(10, k);
        int rem = n % div;
        int q = n / div;
        rem *= (int) Math.pow(10, digits - k);
        rem += q;
        System.out.println(rem);
    }
}