import java.util.*;

class Input_Output_1{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);     //using scanner for taking inputs

        System.out.println("Enter a Character");   //taking input of a character
        char ch = scn.next().charAt(0);

        System.out.println("\nEnter an integer"); //taking input of an Integer
        int n = scn.nextInt();

        System.out.println("\nEnter a Decimal Point Number");   //taking input of a Decimal Number
        double dbl = scn.nextDouble();

        System.out.println("\nInputted Character is: " + ch); //Printing the inputted values
        System.out.println("Inputted Integer is: " + n);
        System.out.println("Inputted Double is: " + dbl);

        scn.close(); 
    }
}
