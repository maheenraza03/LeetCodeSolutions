import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // long a_converted = 0;
        // long b_converted = 0;

        // int power = 0;

        // for (int i = a.length() - 1; i >= 0; i--) {
        //     if (a.charAt(i) == '1') {
        //         a_converted += (int)Math.pow(2, power);
        //     }
        //     power++;
        // }

        // power = 0;

        // for (int i = b.length() - 1; i >= 0; i--) {
        //     if (b.charAt(i) == '1') {
        //         b_converted += (int)Math.pow(2, power);
        //     }
        //     power++;
        // }

        // long sum = a_converted + b_converted;

        // return Long.toBinaryString(sum);

        // convert both strings into a binary numbers using base 2 and store it as a "big" integer
        BigInteger aNum = new BigInteger(a, 2);
        BigInteger bNum = new BigInteger(b, 2);

        // sum the string back up
        BigInteger sum = aNum.add(bNum);

        // convert the number back to binary and return it as a string
        return sum.toString(2);


        
    }
}