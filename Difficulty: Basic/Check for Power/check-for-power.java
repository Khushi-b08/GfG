// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if (X <= 1) {
            return X == 1 && Y == 1;
        }
        if (Y < 1) return false;
        
        while (Y % X == 0) {
            Y /= X;
        }
        return Y == 1;
    }
}
