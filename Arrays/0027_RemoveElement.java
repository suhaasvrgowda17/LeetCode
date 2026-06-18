/*
Problem: 27. Remove Element

Logic:
1. Use a pointer k to keep track of the position where the next valid element should be placed.
2. Traverse the array using pointer i.
3. If nums[i] is not equal to val, copy nums[i] to nums[k].
4. Increment k after placing a valid element.
5. Ignore all occurrences of val.
6. Return k, which represents the number of elements remaining after removal.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
            for (int i = 0; i < nums.length; i++) {
            // Keep only elements that are not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Number of elements remaining after removal
        return k;
    }
}