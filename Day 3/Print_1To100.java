import java.util.Scanner;

public class Print_1To100 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); //taking input of n and calling printTillN
        printTillN(n);

        scn.close();
        
    }

    static void printTillN(int n){   //prints from 1 to n

        if(n == 1){ //base condition to stop
            System.out.println(n);
            return;
        }

        printTillN(n-1); //recursive call
        System.out.println(n); //finally print the output

    }
}
