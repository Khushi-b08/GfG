// User function Template for Java

class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
        int sum=1;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
};