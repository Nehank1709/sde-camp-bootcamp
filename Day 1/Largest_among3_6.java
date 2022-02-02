import java.util.*;

public class Largest_among3_6 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number");   //take input of three numbers
        int a = scn.nextInt();

        System.out.println("Enter second number");
        int b = scn.nextInt();

        System.out.println("Enter third number");
        int c = scn.nextInt();

        int max = a;    //assume maximum is a

        if(b > max && b > c){ //if b is greater than a and max then max is b
            max = b;
        }

        if(c > max && c > b){   //if c is greater than b and max then max is c
            max = c;
        }

        System.out.println("The maximum among 3 is: "+ max); //printing the maximum value

        scn.close();
    }
}
