//Leetcode fibonacci-number
class Solution1 {
    public int fib(int n) {
        
        if(n <2){   //base condition to stop recursive calls
            return n;
        }
        
        return fib(n-1) + fib(n-2); //recursive calls finally returns sum of last two numbers
    }
}
