class Solution {
    public long minimumSteps(String s) {
        long temp=0;
        long swap=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                temp++;
            }
              if(s.charAt(i)=='0'){
                swap=swap+temp;
            }
        }
        return swap;
    }
}