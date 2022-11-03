class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left=0,right=0;
        Set<Character> s2 =new HashSet();
        int max=0;
        while(right<s.length()){
            char c= s.charAt(right);
            if(s2.add(c)){
                max=Math.max(max,right-left+1);
                    right++;
                  }
            else{
                while(s.charAt(left)!=c){
                    s2.remove(s.charAt(left));
                    left++;
                }
            s2.remove(c);
            left++;
            
        }
    }
    return max;
        
        
    
    }
}