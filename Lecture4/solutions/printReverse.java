import java.util.*;
public class printReverse {
    /*Reverse A Number*/
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //divide n until it is greater then 0
    while(n > 0){
        //Number%10 will give the last digit
        int rem = n%10;
        //printing last digit
        System.out.println(rem);
        //dividing the number by 10 and storing it in n
        //alternatively this can be written as n/=10;
        n = n/10;
    }
   }
}
