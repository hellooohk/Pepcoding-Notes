import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nos = n/2 + 1;
        int nsp = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int k = 1 ; k <= nos ; k++){
                System.out.print("*\t");
            }
             for(int k = 1 ; k <= nsp; k++){
                System.out.print("\t");
            }
             for(int k = 1 ; k <= nos ; k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= n/2){
                nos--;
                nsp+=2;
            }
            else{
                nos++;
                nsp-=2;
            }
        }
    }
}