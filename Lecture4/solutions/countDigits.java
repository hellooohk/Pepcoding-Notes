import java.util.*;
public class countDigits {
    /*Count Digits In A Number*/
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       //@n 
       int n = scn.nextInt();
       //Initially digits will be 0
       int d = 0;
       //We are dividing n until it becomes 0
       while(n > 0){
           n = n/10;
           //Incrementing digits d each time
           d++;
       }
       System.out.println(d);
   } 
}
