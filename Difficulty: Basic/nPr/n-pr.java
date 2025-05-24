// User function Template for Java

class Solution {
    static long fact(long n){
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
    static long nPr(long n, long r) {
        // code here
        long result= fact(n)/fact(n-r);
        return result;
        
    }
}