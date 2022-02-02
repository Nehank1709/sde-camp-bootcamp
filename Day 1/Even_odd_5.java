import java.util.*;

public class Even_odd_5 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter any number");
        int n = scn.nextInt();      //taking input of a number
        scn.close();

        if(n%2 ==0){  //on dividing number by 2 if remainder is 0 then even number
            System.out.println("Even");
        }

        else{   //else odd number
            System.out.println("Odd");
        }
    }
}
