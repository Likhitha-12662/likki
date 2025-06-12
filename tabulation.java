class Solution {
    public int fib(int n) {
        // Handle base cases
        if (n <= 1) return n;

        // Initialize an array to store Fibonacci numbers
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Fill the dp array using the bottom-up approach
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return the nth Fibonacci number
        return dp[n];
    }
}
