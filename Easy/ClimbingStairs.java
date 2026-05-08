class Solution {
    public int climbStairs(int n) {

        // base cases: 1 step has 1 way, 2 steps has 2 ways
        int oneStep = 1;
        int twoSteps = 2;

        // return case if n = 1 
        if (n == 1) {
            return oneStep;
        }

        // return case if n = 2
        if (n == 2)  {
            return twoSteps;
        }

        // to store the total ways for n stairs
        int sum = 0;


        // starting at 3 steps of stairs and incrementing to n, take the sum and then move the variables one forward since the sum of f(n) is the sum of the last two f(n-1) and f(n-2)
        for (int i = 3; i <= n; i++) {
            sum = oneStep + twoSteps;
            oneStep = twoSteps;
            twoSteps = sum;
        }

        // return the resulting sum of ways
        return sum;

    }
}