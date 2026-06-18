/*
Problem: 189. Rotate Array

Logic:
1. Create a temporary array of the same size as nums.
2. Traverse the original array using index i.
3. Place each element at its new position using:
   (i+k)%n
4. Copy all elements from the temporary array back to nums.
5. The array is now rotated to the right by k positions.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution{
    public void rotate(int[] nums,int k) {
        int n=nums.length;
        int[] temp=new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%n]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}