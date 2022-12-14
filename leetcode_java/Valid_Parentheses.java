

class Solution {
    Map<Character,Character> map=new HashMap<>();
    public boolean isValid(String s) {
        
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        
        //Stack<Character> st=new Stack<>();
        int top=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(map.containsValue(c)){
                //st.push(c);
                top=i;
            }
            else{
                if(top==-1 || map.get(c)!=s.charAt(top)){
                    return false;
                }
                else{
                    top=getTop(s,top-1);
                }
            }
        }
        
        return top==-1;
    }
    
    int getTop(String s,int index){
        int right=0;
        
        while(index>=0){
            char ch=s.charAt(index);
            if(map.containsKey(ch))// ch = is closing bracket
            {
                right++;
            }
            else{
                right--;
            }
            
            if(right<0){
                return index;
            }
            index--;
        }
        
        return -1;
    }
}