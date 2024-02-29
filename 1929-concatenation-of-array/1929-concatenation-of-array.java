class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
     int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[len+i]=nums[i];
        }
       return arr; 
        
  }
}
// final int n = nums.length;

//     int[] ans = new int[n * 2];

//     for (int i = 0; i < n; ++i)
//       ans[i] = ans[i + n] = nums[i];

//     return ans;
//   }