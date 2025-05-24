class Solution {
    public boolean isValid(String s) {
        // definding a map to map each opening bracket to its closing one
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        // creating a stack to know what order of brackets the string has
        Stack<Character> b = new Stack<>();

        // if the string is empty, return true
        if (s.isEmpty() == true) {
            return true;
        }

        // loop through the string at each char
        for (int i = 0; i < s.length(); i++) {
            // to know what the current bracket is
            char currentChar = s.charAt(i);
            // checking if its an opening bracket and pushing it to the stack
            if (brackets.containsKey(currentChar)) {
                b.push(currentChar);
            // check if its a closing bracket
            } else if (brackets.containsValue(currentChar)) {
                // if the stack is already empty, return false (meaning there's no corrsponding opening bracket)
                if (b.empty()) {
                    return false;
                }

                // popping the last bracket from the stack
                char lastOpen = b.pop();
                // if the map key and values don't match, return false
                if (brackets.get(lastOpen) != currentChar) {
                    return false;
                }

            }
        }

        // as long as the stack is clean, that means each opening bracket has its corresponding closing bracket
        return b.isEmpty();
    }
}