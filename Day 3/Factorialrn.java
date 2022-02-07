import java.util.Scanner;

public class Factorialrn {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();  //taking input of a number
        System.out.println(factrl(n));  //printing factorial of the inputted number 

        scn.close();

    }

    static long factrl(int n){ //calculates factorial of a number

        if(n == 1){     //base condition to stop 
            return 1;
        }

        return n* factrl(n-1); //recursive call to find factorial
    }
}
