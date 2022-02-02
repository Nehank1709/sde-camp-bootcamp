import java.util.*;

public class Age_2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);   //using scanner

        System.out.println("Enter an age"); 
        int age = scn.nextInt();    //taking input of age

        if(age > 18 && age < 110){ //if age is greater than 18 and valid

            System.out.println("\nAge is greater than 18"); 
        }

        else if(age <= 18 && age >0){ //if age is less than or equal to 18 and valid

            System.out.println("\nAge is lesser than or equal to 18");
        }

        else{
            System.out.println("Invalid age"); //for invalid input
        }

        scn.close();
    }
}
