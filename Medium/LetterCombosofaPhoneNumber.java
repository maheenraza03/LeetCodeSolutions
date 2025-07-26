import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        // creating a result list
        List<String> result = new ArrayList<>();

        // return nothing if the string is empty
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // creating a map that maps each string digit to the appropriate letters
        Map<String, List<String>> multiMap = new HashMap<>();
        multiMap.put("2", List.of("a", "b", "c"));
        multiMap.put("3", List.of("d", "e", "f"));
        multiMap.put("4", List.of("g", "h", "i"));
        multiMap.put("5", List.of("j", "k", "l"));
        multiMap.put("6", List.of("m", "n", "o"));
        multiMap.put("7", List.of("p", "q", "r", "s"));
        multiMap.put("8", List.of("t", "u", "v"));
        multiMap.put("9", List.of("w", "x", "y", "z"));

        // looping through the digit string and getting the appropriate letters to store into a list
        List<List<String>> lettersLists = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            List<String> letters = multiMap.get(String.valueOf(c));
            // if there are no letters
            if (letters == null) {
                return result;
            }

            // add the letters to our list
            lettersLists.add(letters);
        }

        // creating the combinations of all the letters using our helper method
        backtrack(lettersLists, 0, new StringBuilder(), result);
        return result;
    }

    // a helper method to backtrack
    private void backtrack(List<List<String>> lists, int index, StringBuilder path, List<String> result) {
        // if the list has nothing (0), just return
        if (index == lists.size()) {
            result.add(path.toString());
            return;
        }

        // loop through our list at each index
        for (String letter : lists.get(index)) {
            // add the current letter to the path
            path.append(letter);
            // recursive call to move to the next index
            backtrack(lists, index + 1, path, result);
            // backtrack: remove the last letter we already added
            path.deleteCharAt(path.length() - 1);
        }
    }
}
