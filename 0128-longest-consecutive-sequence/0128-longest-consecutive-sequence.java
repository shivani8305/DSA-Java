class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max=0;
        int i=0;
        if(nums.length==0)
        {
            return 0;
        }
        else if (nums.length==1)
        {
            return 1;
        }
        else
        {
            while(i+1<nums.length)
        {
            if(nums[i] == nums[i+1]-1)
            {
                count++;
                max = Math.max(count,max);
            }
            else if(nums[i]==nums[i+1])
            {
                max =  Math.max(count,max);
            }
            else
            {
                count = 1;
                max = Math.max(count, max);
            }
          
            i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j]+" ");
        }
        }
        return max;
        }
       
}
