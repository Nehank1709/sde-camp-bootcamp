
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Patterns.pattern2(n);   //same as only pattern2(n)

        System.out.println();   
        Patterns.pattern1(n);

        System.out.println();   
        Patterns.pattern3(n);

        System.out.println();   
        Patterns.pattern4(n);

        System.out.println();   
        Patterns.pattern5(n);

        System.out.println();   
        Patterns.pattern6(n);

        System.out.println();   
        Patterns.pattern7(n);

        System.out.println();   
        Patterns.pattern8(n);

        System.out.println();   
        Patterns.pattern9(n);

        System.out.println();   
        Patterns.pattern10(n);

        System.out.println();   
        Patterns.pattern11(n);

        System.out.println();   
        Patterns.pattern13(n);

        System.out.println();   
        Patterns.pattern14(n);

        System.out.println();   
        Patterns.pattern15(n);

        System.out.println();   
        Patterns.pattern16(n);

        System.out.println();   
        Patterns.pattern17(n);

        System.out.println();   
        Patterns.pattern18(n);

        System.out.println();   
        Patterns.pattern19(n);
   
    }

    static void pattern1(int n){

        for(int i =1; i<= n; i++){

            for(int j =1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for(int i =1; i<= n; i++){

            for(int j =1; j<= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        for(int i =1; i<= n; i++){

            for(int j =1; j<= n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){

        for(int i =1; i<= n; i++){

            for(int j =1; j<= i; j++){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){

        for(int i =1; i< 2*n; i++){

            int c = i > n ? (2*n -i): i;

            for(int j =1; j<=c; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern6(int n){  //pattern8

        for(int i =1; i<= n; i++){

            for(int space = 1; space <= (n - i); space++){
                System.out.print("  ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern7(int n){ 

        for(int i = 1; i <= n; i++){

            for(int space = 1; space <= i-1; space++){
                System.out.print("  ");
            }

            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern8(int n){  

        for(int i =1; i<= n; i++){

            for(int space = 1; space <= (n - i); space++){
                System.out.print("  ");
            }

            for(int j = 1; j<= 2*i - 1; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern9(int n){  

        for(int i =1; i<= n; i++){

            for(int space = 1; space <= i - 1; space++){
                System.out.print("  ");
            }

            for(int j = 1; j<= 2*n - (2*i - 1); j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern10(int n){  

        for(int i =1; i<= n; i++){

            for(int space = 1; space <= (n - i); space++){
                System.out.print(" ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern11(int n){  

        for(int i =1; i<= n; i++){

            for(int space = 1; space <= i - 1; space++){
                System.out.print(" ");
            }

            for(int j = 1; j<= n +1 -i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern13(int n){  

        for(int i = 0; i< n; i++){

            for(int space = 1; space < n-i; space++){
                System.out.print(" ");
            }

            for(int j = 0; j<= i; j++){

                long val = Patterns.factorial(i) / (factorial(i-j) * factorial(j));  //calculating nCr
                System.out.print(val +" ");
            }
            
            System.out.println();
        }
    }

    static long factorial(int a){
        
        long fact = 1;

        for(int i = 2; i <= a; i++ ){

            fact *= i;
        }

        return fact;
    }

    static void pattern14(int n){

        for(int i = 1; i < 2*n; i++ ){

            int c = i> n ? (2*n - i): i; 
            int space = n-c;

            for(int j =1; j<=space; j++){
                System.out.print("  ");
            }

            for(int j =c; j>=1; j--){
                System.out.print( j + " ");
            }

            for(int j = 2; j <= c; j++){
                System.out.print(j +" " );
            }
            
            System.out.println();

        }
    }

    static void pattern15(int n){

        // int up, down, left, right;

        for(int i = 0; i < n; i++ ){

            for(int j = 0; j< n; j++){
                
                // up = i;
                // down = n - i - 1;
                // left = j;
                // right = n - j - 1;

                if(Math.min(i,(Math.min((n - 1 - i), (Math.min(j, ( n  - 1 - j)))))) ==0)
                {
                    System.out.print( "* ");
                }

                else{
                    System.out.print( "  ");
                }
               
            }
            System.out.println();
        }
    }

    static void pattern16(int n){

        int k = 1;
        for(int i =1; i<= n; i++){

            for(int j =1; j <= i; j++){

                System.out.print(k + " ");
                k++;
            }
            
            System.out.println();
        }
    }

    static void pattern17(int n){

        for(int i =1; i<= n; i++){

            for(int j = n; j >= i; j--){

                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }

    static void pattern18(int n){

        for(int i =1; i<= 2*n; i++){

            int c = i > n ? (2*n -i+ 1): i;

            for(int j =1; j<=c; j++){
                System.out.print("* ");
            }

            for(int space = 1; space <= ( n > i ? (n-i)*2 : (i-n-1)*2 ); space ++){
                System.out.print("  ");
            }

            for(int j =1; j<=c; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }


    static void pattern19(int n){

        // int up, down, left, right;

        for(int i = 0; i < 2 * n - 1; i++ ){

            for(int j = 0; j< 2 * n - 1; j++){
                
                // up = i;
                // down = 2*n - i -2;
                // left = j;
                // right = 2 * n - j -2;

                System.out.print((n -  Math.min(i,(Math.min((2*n - 2 - i), (Math.min(j, (2 * n -2 - j))))))) + " ");
               
            }
            System.out.println();
        }
    }
}
/* Pattern2:
   *
   * *
   * * *
   * * * *

*/

/*Pattern1:

* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *

*/

/* Pattern3:

   * * * *
   * * *
   * * 
   * 

*/

/* Pattern4:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

/* Pattern5:

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

/* Pattern6:

        *
      * *
    * * *
  * * * *
* * * * *

*/

/* Pattern7:

* * * * *
  * * * *
    * * *
      * *
        *
*/

/* Pattern8:

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/

/* Pattern9:

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

/* Pattern10:

    *
   * *
  * * *
 * * * *
* * * * *

*/


/* Pattern11:

* * * * *
 * * * *
  * * *
   * *
    *

*/

/* Pattern13:

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/

/* Pattern14:

         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4 
     3 2 1 2 3
       2 1 2
         1
*/

/* Pattern15:

* * * * *
*       *
*       *
*       *
* * * * *

*/

/* Pattern16:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

/* Pattern17:

1 1 1 1 1
2 2 2 2
3 3 3
4 4
5

*/

/* Pattern18:

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/

/* Pattern19:

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

*/

