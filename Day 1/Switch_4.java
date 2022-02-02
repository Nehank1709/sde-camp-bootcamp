import java.util.*;

public class Switch_4 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter any two whole numbers"); //taking input of two numbers
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("List of operations available: \n1. add \n2. subtract \n3. multiply \n4. divide \n"); //printing the list of available operations
        System.out.println("Enter the name of operation to perform");
        String operation = scn.next();

        switch(operation){ //using switch case for creating simple calculator

            case "add": System.out.println("Sum of the numbers: " + (a+b));
                        break;

            case "subtract": System.out.println("Difference of the numbers: " + Math.abs((a - b)));
                        break;

            case "multiply": System.out.println("Multiplication of numbers: " + (a * b));
                        break;

            case "divide": System.out.println("Division of numbers: First Number/Second Number is "+ (a/b) + " and Second Number/First Number is " + (b/a));
                        break;

            default: System.out.println("Operation not present"); //for case when inputted operation doesn't match the above ones
        }

        scn.close(); 
    }
}
