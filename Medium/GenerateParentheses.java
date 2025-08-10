class Solution {
    public List<String> generateParenthesis(int n) {
        // variable to store the number of open brackets
        int openBracketCount = 0;
        // variable to store the number of closed brackets
        int closedBracketCount = 0;

        // to store the list of results
        List<String> result = new ArrayList<>();

        // calling our helper function
        backtrack("", openBracketCount, closedBracketCount, n, result);
        return result;


    }

    // our helper function
    // takes in our current string (which is empty), the current number of closed and open brackets, the number of pairs of brackets and the resulting string list
    private void backtrack(String current, int open, int close, int max, List<String> result) {
        // we first check to see if we have a complete pair, if we do, add it to the result
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // if we still have an open bracket to add, call the recursive function
        if (open < max) {
            backtrack(current + "(", open + 1, close, max, result);
        }

        // we can only add a closed bracket if there's more open brackets than closed ones
        if (close < open) {
            backtrack(current + ")", open, close + 1, max, result);
        }
    }
}