import java.util.Scanner;

public class Vowel_8 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);     //using scanner for taking inputs

        System.out.println("Enter a Character");   //taking input of a character
        char ch = scn.next().charAt(0);
        scn.close();

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
           ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){   //checks for vowel and prints vowel  for true condition

            System.out.println("Vowel");
            return;
           }

        System.out.println("Not Vowel"); //if not a vowel prints this
    }
}
