/*
Problem: 304. Range Sum Query 2D - Immutable

Logic:
- Build 2D prefix sum array
- Use it to answer queries in O(1)

Time Complexity:
- Constructor: O(m*n)
- sumRegion(): O(1)

Space Complexity: O(m*n)
*/

class NumMatrix{
    int[][] prefix;

    public NumMatrix(int[][]matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;

        prefix=new int[rows+1][cols+1];

        for(int r=1;r<=rows;r++){
            for(int c=1;c<=cols;c++){
                prefix[r][c]=matrix[r-1][c-1]
                             git status+prefix[r-1][c]
                             +prefix[r][c-1]
                             -prefix[r-1][c-1]; // add current value, top and left, subtract repeated part
            }
        }
    }

    public int sumRegion(int row1,int col1,int row2,int col2){
        return prefix[row2+1][col2+1]
             -prefix[row1][col2+1]
             -prefix[row2+1][col1]
             +prefix[row1][col1]; // take full area, remove extra parts, add back overlap
    }
}