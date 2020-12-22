class Solution {
   public   List<String> generateParenthesis(int n) {
       if(n == 0){
           return new ArrayList<String>();
       }
       List<String> strs = new ArrayList<String>();
       generateReal(0,0,strs,n,"" );
       return  strs;
    }

    private   void generateReal(int left, int right, List<String> strs, int n,String str ) {
        if(left==n && right==n){
            strs.add(str);
            return;
        }
        //
        if(left<n){
            generateReal(left+1,right,strs,n,str+"(");
        }
        if(right<n && right<left) {
            generateReal(left, right + 1, strs, n, str + ")");
        }
    }
}