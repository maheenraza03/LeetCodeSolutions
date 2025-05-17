import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // was gonna use if else statements, but that would take to long, so used a map to map char to appropriate int
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // to store the actual result
        int result = 0;

        // loop through the string at each char
        for (int i = 0; i < s.length(); i++) {
            // find the appropriate int value for that char
            int current = romanMap.get(s.charAt(i));
            // check to see if the next value in roman is greater than the current, if so, subtract
            if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > current) {
                result -= current;
            // otherwise add
            } else {
                result += current;
            }
        }
        // return the integer result
        return result;
    }
}
