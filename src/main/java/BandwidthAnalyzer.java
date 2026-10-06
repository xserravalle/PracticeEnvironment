/**
 * SCENARIO: 5G Network Cell Peak Bandwidth Window
 * DISCIPLINE: SLIDING WINDOW
 * -----------------------------------------------------------------------------
 * Context:
 * Cellular capacity planning requires detecting periods of peak sustained data 
 * volume over a continuous rolling window of minutes to size backhaul pipes.
 *
 * Objective:
 * Find the maximum sum of any contiguous subarray of size 'windowSize'.
 *
 * Sliding Window Mechanics:
 * 1. Base Window: Compute the sum of the initial 'windowSize' elements (indices 0 to k - 1).
 * 2. Sliding State: Shift the window right one index at a time:
 *    - Add the incoming element: bandwidthLogs[right]
 *    - Subtract/evict the outgoing element: bandwidthLogs[right - windowSize]
 *    - Update the running maximum: maxSum = Math.max(maxSum, runningSum)
 * 3. Efficiency: Each shift executes in O(1) time without re-summing the window.
 *
 * Guard & Boundary Conditions:
 * - Null or empty array returns 0.
 * - windowSize <= 0 or windowSize > array length returns 0.
 * - Use 64-bit 'long' for accumulated sums to prevent integer overflow.
 *
 * Complexity:
 * - Time Complexity:  O(N) — single linear pass through the array.
 * - Space Complexity: O(1) auxiliary memory.
 */
public class BandwidthAnalyzer {

    public static long findMaxSustainedBandwidth(int[] bandwidthLogs, int windowSize) {
        // Guard clauses
        if (bandwidthLogs == null || bandwidthLogs.length == 0 ||
                windowSize <= 0 || windowSize > bandwidthLogs.length) {
            return 0;
        }

        // Step 1: Initialize the first window
        long currentWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += bandwidthLogs[i];
        }

        long maxWindowSum = currentWindowSum;

        // Step 2: Slide the window across the remaining readings
        for (int right = windowSize; right < bandwidthLogs.length; right++) {
            // Evict left element (right - windowSize) and add incoming element (right)
            currentWindowSum += bandwidthLogs[right] - bandwidthLogs[right - windowSize];
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
        }

        return maxWindowSum;
    }

    public static void main(String[] args) {
        // Test Case 1: Standard peak window in the middle
        int[] test1 = {120, 350, 410, 200, 500, 180, 290};
        int window1 = 3;
        System.out.println("Test 1 (Expected 1110): " + findMaxSustainedBandwidth(test1, window1));

        // Test Case 2: Window size equals array length
        int[] test2 = {100, 200, 300};
        int window2 = 3;
        System.out.println("Test 2 (Expected 600):  " + findMaxSustainedBandwidth(test2, window2));

        // Test Case 3: Window size exceeds array length
        int[] test3 = {450, 200};
        int window3 = 3;
        System.out.println("Test 3 (Expected 0):    " + findMaxSustainedBandwidth(test3, window3));

        // Test Case 4: Single element window (windowSize = 1)
        int[] test4 = {50, 900, 25};
        int window4 = 1;
        System.out.println("Test 4 (Expected 900):  " + findMaxSustainedBandwidth(test4, window4));

        // Test Case 5: Large values testing 64-bit integer overflow
        int[] test5 = {1_500_000_000, 1_800_000_000, 1_200_000_000};
        int window5 = 2;
        System.out.println("Test 5 (Expected 3300000000): " + findMaxSustainedBandwidth(test5, window5));
    }
}