class Solution {
    public String convert(String s, int numRows) {
        // defining our stringbuilder
        StringBuilder[] stringbuild = new StringBuilder[numRows];
        // for each row of letters, we'll have them be separate stringbuilders, so we have an array of them
        for (int i = 0; i < numRows; i++) {
            stringbuild[i] = new StringBuilder();
        }

        // taking the input string and converting it into a character array
        char[] charArray = s.toCharArray();
        // looking at how many characters we have
        int n = charArray.length;
        int index = 0;

        while (index < n) {
            // going down the rows; append whatever character exists to the stringbuilder array
            for (int j = 0; j < numRows && index < n; j++) {
                stringbuild[j].append(charArray[index++]);
            }
            
            // going up; we start at the second last row since we ended at the last row and go up until we bit 0 for the first row
            for (int j = numRows - 2; j > 0 && index < n; j--) {
                stringbuild[j].append(charArray[index++]);
            }

        }

        // combining the arrays of stringbuilders into 1
        StringBuilder result = stringbuild[0];
        for (int i = 1; i < numRows; i++) {
            result.append(stringbuild[i].toString());
        }

        return result.toString();
    }
}