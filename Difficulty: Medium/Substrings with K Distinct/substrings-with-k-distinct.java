// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
        return countAtMostK(s,k)-countAtMostK(s,k-1);
    }
    public int countAtMostK(String s, int k){
        int l=0,r=0,c=0;
        Map<Character, Integer> map = new HashMap<>();
        for(r=0;r<s.length();r++){
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0)+1);
            while(map.size()>k){
                char leftChar = s.charAt(l);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}