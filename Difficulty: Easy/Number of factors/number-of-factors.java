// User function Template for Java
class Solution {
    static int countFactors(int N) {
        // code here
        int c=2;
        for(int i=2;i<=N/2;i++){
            if(N%i==0){
                c+=1;
            }
        }
        return c;
    }
}