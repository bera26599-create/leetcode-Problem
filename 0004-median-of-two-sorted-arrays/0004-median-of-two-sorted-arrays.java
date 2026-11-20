class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int nums3[] = new int[n+m];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            nums3[nums1.length+i] = nums2[i];
        }
          Arrays.sort(nums3);
        int temp;
        if(nums3.length%2==0){
            temp=nums3.length/2;
            int temp1=temp-1;
            int bp=nums3[temp1]+nums3[temp];
            double evenans=bp/2.0;
            return evenans;
        }
       else{
        double ansodd=nums3[nums3.length/2];
        return ansodd;
       }
   
    }
}