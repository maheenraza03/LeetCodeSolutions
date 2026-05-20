class Solution {
    public int romanToInt(String s) {
        // create a hashmap for pairings for numbers with their roman versions
        HashMap<Character, Integer> romanToInteger = new HashMap<>();

        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        // value we will be returning at the end
        int result = 0;
        
        // loop through the string
        for (int i = 0; i < s.length(); i++) {
            // get the current char
            char atRoman = s.charAt(i);

            // get the value of the current char as per the hashmap
            int value = romanToInteger.get(atRoman);

            // check to see if we're in bounds
            if (i < s.length() - 1) {
                // get the new chars to become a string
                String pair = s.substring(i, i + 2);
                // check if the substring is a combination of any of the following
                if (pair.equals("IV")) {
                    result += 4;
                    i++;
                } else if (pair.equals("IX")) {
                    result += 9;
                    i++;
                } else if (pair.equals("XL")) {
                    result += 40;
                    i++;
                } else if (pair.equals("XC")) {
                    result += 90;
                    i++;
                } else if (pair.equals("CD")) {
                    result += 400;
                    i++;
                } else if (pair.equals("CM")) {
                    result += 900;
                    i++;
                } else {
                    result += romanToInteger.get(s.charAt(i));
                }

            } else {
                result += romanToInteger.get(s.charAt(i));
            }
        }

        return result;
    }
}