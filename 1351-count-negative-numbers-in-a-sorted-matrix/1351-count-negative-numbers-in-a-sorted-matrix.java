class Solution {
    public int countNegatives(int[][] grid) {
       int count=0;
        for(int[] arr:grid)
        {
            for(int element:arr)
            {
                if(element<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}  
    