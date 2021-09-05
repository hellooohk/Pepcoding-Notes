import java.util.*;
public class printFibonacci {
    /*Print Fibonacci Numbers Till N*/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // @n No of Fibonacci terms
        int n = scn.nextInt();
        //First Term of Fibonacci Sequence is 0
        //Second Term of Fibonacci Sequence is 1
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            //Next Term can be given as Sum of previous two terms
            int nextTerm = firstTerm + secondTerm;
            System.out.println(firstTerm);
            //First becomes second
            firstTerm = secondTerm;
            //Second becomes nextTerm
            secondTerm = nextTerm;
        }

    }
}
