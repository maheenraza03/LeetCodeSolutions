class Solution {
    public String multiply(String num1, String num2) {

        // if any one of the strings is "0", return "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        // calculate the length of the individual strings
        int lengthOfNum1 = num1.length();
        int lengthOfNum2 = num2.length();
        
        // create an array that has the length that is the sum of the lengths of the strings 
        int[] result = new int[lengthOfNum1 + lengthOfNum2];

        // looping through each char in the string from right to left like you do when you multiply on paper
        for (int i = lengthOfNum1 - 1; i >= 0; i--) {
            for (int j = lengthOfNum2 - 1; j >= 0; j--) {
                // getting the single digit in a number by converting it into a char
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                // multiplying those two digits
                int product = digit1 * digit2;

                // calculating the position of where the result should be placed in the array
                int positionLow = i + j + 1;
                int positionHigh = i + j;

                // add whatever the current product is to whats already stored in the array
                int sum = product + result[positionLow];

                // handle the carry
                result[positionLow] = sum % 10;
                result[positionHigh] += sum / 10;
            }
        }

        // skip any leading zeros ()
        int index = 0;
        while (index < result.length && result[index] == 0) {
            index += 1;
        }

        if (index == result.length) {
            return "0";
        }

        // used to create the final string
        StringBuilder answer = new StringBuilder();
        for (int k = index; k < result.length; k++) {
            answer.append((char)(result[k] + '0'));
        }

        return answer.toString();


    }
}