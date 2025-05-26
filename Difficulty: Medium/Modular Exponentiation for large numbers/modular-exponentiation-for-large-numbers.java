// User function Template for Java

class Solution {
    public long PowMod(long x, long n, long m) {
        // Code here
        long result=1;
        x%=m;
        if(x==0){
            return 0;
        }
        while(n>0){
            if((n&1)!=0){
                result = (result*x)%m;
            }
            n=n>>1;
            x=(x*x)%m;
        }
        return result;
    }
}