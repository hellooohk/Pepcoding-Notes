import java.util.*;
public class inverseNumber {
    /*Inverse Of A Number*/
    /*Points to remember while solving this question
            Example 3 1 2 4
                idx 4 3 2 1
            1 Pr 4 Pada Hai
            then 4 Par 1 Dale
            Output 
            Inverse 1 4 2 3
                idx 4 3 2 1
    
    */
    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int inverseNumber = 0;
        int i = 1;
        while(n > 0){
            int digit = n%10;
            n/=10;
            inverseNumber += i*(int)Math.pow(10,digit-1);
            i++;
        }
        System.out.println(inverseNumber);
       }
}
