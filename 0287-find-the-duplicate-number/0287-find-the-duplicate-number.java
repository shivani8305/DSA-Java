class Solution {
    public int findDuplicate(int[] nums) {
        int extra=0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<nums.length-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                extra = arr[i];
            }
        }
        return extra;
    }
}