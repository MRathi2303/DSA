class Solution {
    public void rotate(int[][] matrix) {
        
        int arr[][] = new int[matrix.length][matrix.length];
        int size = matrix.length;

        for(int i=0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                arr[j][size-i-1] = matrix[i][j];
            }
        }


        for(int i = 0 ; i < size; i++) {
            for(int j=0; j < size; j++) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}