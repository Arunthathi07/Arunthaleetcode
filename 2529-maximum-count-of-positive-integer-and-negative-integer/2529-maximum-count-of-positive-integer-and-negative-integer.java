class Solution {
    public int maximumCount(int[] nums) {
        int cp=0;
        int cn=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                cn++;
            }
            if(nums[i]>0)
            {
                cp++;
            }       
        }
        return Math.max(cn,cp);
    }
}