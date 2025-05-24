// User function Template for Java

class Solution {
    public String calculateFraction(int a, int b) {
        // code here
        if(a==0){
            return "0";
        }
        String result = (a<0)||(b<0)?"-":"";
        a=Math.abs(a);
        b=Math.abs(b);
        result+=String.valueOf(a/b);
        int r = a%b;
        if(r==0){
            return result;
        }
        result+=".";
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(r>0){
            if(hm.containsKey(r)){
                result=result.substring(0,hm.get(r))+"("+result.substring(hm.get(r))+")";
                break;
            }
            hm.put(r, result.length());
            r = r * 10;
            result += Integer.toString(r / b);
            r = r % b;
        }
        return result;
    }
}