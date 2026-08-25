

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int row = 0; row < numRows; row++) {
            triangle.add(generateRow(row));
        }
        
        return triangle;
    }
    
    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add((int) ans); // Add the first element: 1
        
        for (int col = 1; col <= row; col++) {
            ans = ans * (row - col + 1) / col; 
            currentRow.add((int) ans);
        }
        
        return currentRow;
    }
}

