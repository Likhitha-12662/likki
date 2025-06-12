import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }

                  return memo.get(n);
        }
  // Check if the value is already computed
        if (memo.containsKey(n)) {

        // Compute and store the result in the memo map
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
}
