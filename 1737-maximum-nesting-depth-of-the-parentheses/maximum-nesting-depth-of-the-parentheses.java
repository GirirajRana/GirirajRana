class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        int depth=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
                max=Math.max(max,depth);
            }else if(ch==')'){
                depth--;
            }
        }
        return max;
    }
}