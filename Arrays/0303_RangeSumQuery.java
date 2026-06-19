/*
Problem: 303. Range Sum Query - Immutable

Logic:
1. Create a prefix sum array.
2. Store the first element of nums in prefix[0].
3. Traverse nums from index 1 to n-1.
4. At each index i, store:
   prefix[i]=prefix[i-1]+nums[i]
   This represents the sum of all elements from index 0 to i.
5. For a query:
   - If left==0, return prefix[right].
   - Otherwise, return:
     prefix[right]-prefix[left-1]
    (This removes the sum before left and gives the required range sum.)

Time Complexity:
- Constructor: O(n)
- sumRange(): O(1)

Space Complexity: O(n)
*/

class NumArray{
    int[] prefix;

    public NumArray(int[] nums){
        prefix=new int[nums.length];

        // Store first element
        prefix[0]=nums[0];

        // Build prefix sum array
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }

    public int sumRange(int left,int right){
        // If range starts from index 0
        if(left==0){
            return prefix[right];
        }

        // Remove sum before left
        return prefix[right]-prefix[left-1];
    }
}