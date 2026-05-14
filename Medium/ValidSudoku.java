class Solution {
    public boolean isValidSudoku(char[][] board) {
        // defining a hashset to track every number we see in a row, column or box
        Set<String> seen = new HashSet<>();

        // iterate through the sudoku board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // the value we're at in the board
                char val = board[r][c];

                // if it's an empty value, keep going
                if (val == '.') {
                    continue;
                }

                // creating unique identifiers for each row, col and box to make sure we only see the number once
                String row = val + " row " + r;
                String col = val + " col " + c;
                String box = val + " box " + (r/3) + "-" + (c/3);

                // since a hashset can't contain duplicates, we can't add the value if its already there
                if (!seen.add(row) || !seen.add(col) || !seen.add(box)) {
                    return false;
                }
            }
        }

        return true;
    }
}