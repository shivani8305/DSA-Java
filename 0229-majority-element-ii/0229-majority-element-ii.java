class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int len = nums.length;
        int target = len/3;
        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==target){
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}