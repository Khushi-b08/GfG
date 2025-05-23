class Solution {
    static String decToBinary(int n) {
        // code here
        if (n == 0) return "0";
        StringBuilder str = new StringBuilder();
        int r;
        while(n>0){
            r=n%2;
            n/=2;
            str.append(String.valueOf(r));
        }
        return str.reverse().toString();
    }
}