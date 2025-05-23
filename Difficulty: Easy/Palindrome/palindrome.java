// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int sum=0,r,x=n;
        while(x>0){
            r=x%10;
            sum=sum*10+r;
            x/=10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}