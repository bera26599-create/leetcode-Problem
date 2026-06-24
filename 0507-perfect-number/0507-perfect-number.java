class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=num/2;
        int sum=0;
        for(int i=1;i<=count;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}