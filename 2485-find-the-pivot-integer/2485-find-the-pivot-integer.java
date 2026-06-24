class Solution {
    public int pivotInteger(int n) {
       int total=n*(n+1)/2;
       int left;
       int right;
       for(int x=0;x<=n;x++){
        left=x*(x+1)/2;
        right=total-(x-1)*x/2;
        if(left==right){
            return x;
        }
       } 
       return -1;
    }
}