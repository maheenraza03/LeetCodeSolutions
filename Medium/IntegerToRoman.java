class Solution {
    public String intToRoman(int num) {
        
        // create an array of the relevant numbers to convert to in roman (including boundaries like 9 and 4)
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};

        // creating a stringbuilder to store the result
        StringBuilder result = new StringBuilder();


        // loop through the numeric value array
        for (int i = 0; i < values.length; i++) {
            // check if the number is greater than the current numeric value in the array
            while (num >= values[i]) {
                // if it is, subtract it from the number
                num -= values[i];
                // add the roman version of it to the stringbuilder
                result.append(romans[i]);
            }
        }

        // convert stringbuilder to string and return
        return result.toString();
    }
}
