
class Solution {
    public static int findCatalan(int n) {
        // code here
        int[] catalan = new int[n+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                catalan[i]+=catalan[j]*catalan[i-j-1];
            }
        }
        return catalan[n];
    }
}
