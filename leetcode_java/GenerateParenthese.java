class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        finalAll("(",1,0,result,n);
        return result;
    }
    void finalAll(String current,int o,int c,List<String> result,int n){
        if(current.length()==2*n){
        result.add(current);
        return;
        }
        if(o<n)
        finalAll(current+"(",o+1,c,result,n);
        if(c<o)
             finalAll(current+")",o,c+1,result,n); 
    }
}