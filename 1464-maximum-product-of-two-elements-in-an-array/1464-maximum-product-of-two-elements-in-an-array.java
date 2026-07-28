class Solution {
    public int maxProduct(int[] nums) {
        int temp;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=(a-1)*(b-1);
        return c;
    }
}