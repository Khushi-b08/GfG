// User function Template for Java

class Sol {
    int divisibleBy4(String N) {
        // Your Code Here
        int n;
        if(N.length()>2){
            n= Integer.parseInt(N.substring(N.length()-2));
        }
        else{
            n=Integer.parseInt(N);
        }
        if(n%4==0){
            return 1;
        }
        return 0;
    }
}