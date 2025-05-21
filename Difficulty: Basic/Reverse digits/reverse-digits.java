// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum;
    }
}