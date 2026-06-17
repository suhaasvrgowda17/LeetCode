/*
Probelm : 01. Two Sum

Logic:
1. Check every possible pair.
2. If the pair sum equals target, return their indices.

Time Complexity: O(n²)
Space Complexity: O(1)
*/
class Solution {
    public int[] twoSum(int[] nums,int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // Valid pair found
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}