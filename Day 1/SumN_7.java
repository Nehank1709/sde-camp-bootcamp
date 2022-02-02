import java.util.*;

public class SumN_7 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the value of n"); //taking input of n
        int n = scn.nextInt();

        int sum = 0; //it will store the sum of numbers
        String sep = "";  //separator helps in formin 1+2+3.... pattern

        for(int i =1; i<= n; i++){  //calculating sum and printing pattern

            sum += i;
            System.out.print(sep + i);
            sep = " + ";
        }

        System.out.println(" = " + sum);    //calculating final result

        scn.close();
    }
}
