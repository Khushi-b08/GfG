// User function Template for Java
class Solution {
    static int repeatedSumOfDigits(int N) {
        // code here
        if(N/10==0){
            return N;
        }
        int sum=0,r,x=N;
        while(x>0){
            r=x%10;
            sum+=r;
            x/=10;
        }
        N=sum;
        return repeatedSumOfDigits(N);
    }
}
