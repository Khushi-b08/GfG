// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int a=0,b=1,c=a+b;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}