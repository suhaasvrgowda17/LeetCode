/*
Problem: 26. Remove Duplicates from Sorted Array

Logic:
1. Use two pointers i and j.
2. Pointer i keeps track of the last unique element.
3. Pointer j traverses the array.
4. When a new unique element is found, move i forward and place the element at nums[i].
5. Return the count of unique elements (i+1).

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;

        for(int j=0;j<nums.length;j++) {
            // New unique element found
            if(nums[j]!=nums[i]) {
                i++;
                nums[i]=nums[j];
            }
        }
        // Length of array with unique elements
        return i+1;
    }
}