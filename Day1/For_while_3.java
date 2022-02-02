public class For_while_3 {
    public static void main(String[] args) {
        
        System.out.println("Printing 1 to 100 using for loop\n"); //use of for loop
        for(int i = 1; i < 101; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n \nPrinting 1 to 100 using while loop\n"); //use of while loop
        int j = 1;
        while(j < 101){

            System.out.print(j + " ");
            j++;
        }
    }
}
