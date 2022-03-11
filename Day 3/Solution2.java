class Solution2 {
    public void reverseString(char[] s) {
        
        //reverse the array only if size is greater than 0
        if(s.length > 0){
            
            revString(s, 0, s.length-1);
        }
        
    }
    
    public void revString(char[] s, int start, int end){//takes start and end where the existing characters in s will be replaced
        
        if(start >= end){ //base condition to end recursive calls when start is more than or equal to end
            return;
        }
        
        //replace the characters
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
        
        //move start one step forward and end to one step backward
        start++;
        end--;
    
        revString(s, start, end);//recursive call to function with new start, new end and modified s
        
    }
    
}
