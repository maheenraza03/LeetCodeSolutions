class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // initializing our resulting array list
        List<List<Integer>> result = new ArrayList<>();
        
        // calling our recursive function
        backtrack(result, new ArrayList<>(), candidates, target, 0);

        // returning the result
        return result;

    }

    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        // if remain is less than zero, that means our resulting sum is greater than the target
        if (remain < 0) {
            return;
        }

        // if remain is zero, that means we have our numbers
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // loop through the candidates array
        for (int i = start; i < candidates.length; i++) {
            // add the current value to our new array list
            tempList.add(candidates[i]);
            // do a recursive call, but this time, subtract the current candidate value from remain 
            backtrack(result, tempList, candidates, remain - candidates[i], i);
            // go back to the original version of tempList before the current recursive call to explore all options
            tempList.remove(tempList.size() - 1);
        }
    }
}