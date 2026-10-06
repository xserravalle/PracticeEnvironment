/**
 * SCENARIO: Network Tower Peak Signal Tracker
 * DISCIPLINES: ARRAYS
 * -----------------------------------------------------------------------------
 * Context:
 * In a cellular telemetry pipeline, an array of consecutive readings represents
 * signal strength recorded across a physical sequence of towers.
 *
 * Objective:
 * Identify all "Peak Towers" along the route. A tower at index 'i' qualifies
 * as a peak if its signal strength is strictly greater than both its immediate
 * left neighbor (i - 1) and its immediate right neighbor (i + 1).
 *
 * Boundary & Business Rules:
 * 1. Boundary Exclusions: The first tower (index 0) and the final tower
 *    (index n - 1) cannot be peaks because they lack two adjacent neighbors.
 * 2. Minimum Length Guard: Arrays with fewer than 3 elements (or null references)
 *    cannot contain interior elements with two neighbors; return an empty list.
 * 3. Strict Inequality: Equal adjacent values (plateaus such as [40, 40, 40])
 *    do not qualify; the center element must be strictly greater (>).
 * 4. Value Range: Signal values may be negative, zero, or positive integers.
 *
 * Algorithmic Strategy:
 * - Single iterative linear scan bounded from index 1 to (length - 2).
 * - Avoids Out-Of-Bounds exceptions naturally by excluding array boundaries.
 * - Time Complexity:  O(N) — single pass across the array.
 * - Space Complexity: O(1) auxiliary memory (excluding the returned result list).
 */

import java.util.ArrayList;
import java.util.List;

public class SignalTracker {

    /**
     * Identifies indices of elements strictly greater than their immediate neighbors.
     * Time Complexity: O(N)
     * Space Complexity: O(1) auxiliary (excluding return list)
     */
    public static List<Integer> findPeakTowerIndices(int[] signalStrengths) {
        List<Integer> peakIndices = new ArrayList<>();

        // Guard clause: minimum 3 elements needed to have an interior neighbor pair
        // NOTE: || signifies OR operator, value returned will be true or false based on either condition being true
        // Passing the null value FIRST protects against NullPointerException
        // Using | forces BOTH sides to evaluate, which would always trigger NullPointer Exception

        if (signalStrengths == null || signalStrengths.length < 3) {
            return peakIndices;
        }

        // Scan only interior elements: index 1 to n - 2
        // Loop boundaries prevent out of bounds errors
        // NOTE: && LOGICAL AND requires BOTH conditions to be true
        // Current value is STRICTLY GREATER than value to the left
        // Current value is STRICTLY GREATER than the value to the right
        // If BOTH VALUES are true, the element is added to the peakIndices array list

        for (int i = 1; i < signalStrengths.length - 1; i++) {
            if (signalStrengths[i] > signalStrengths[i - 1] &&
                    signalStrengths[i] > signalStrengths[i + 1]) {
                peakIndices.add(i);
            }
        }

        return peakIndices;
    }

    public static void main(String[] args) {
        // Test Case 1: Standard peak identification
        int[] test1 = {10, 20, 15, 2, 23, 90, 67};
        List<Integer> result1 = findPeakTowerIndices(test1);
        System.out.println("Test 1 (Expected [1, 5]): " + result1);

        // Test Case 2: Monotonically increasing (no peaks)
        int[] test2 = {5, 10, 20, 30};
        List<Integer> result2 = findPeakTowerIndices(test2);
        System.out.println("Test 2 (Expected []):     " + result2);

        // Test Case 3: Flat plateau with equal values (strict inequality check)
        int[] test3 = {40, 40, 40};
        List<Integer> result3 = findPeakTowerIndices(test3);
        System.out.println("Test 3 (Expected []):     " + result3);

        // Test Case 4: Insufficient length (< 3 elements)
        int[] test4 = {15, 25};
        List<Integer> result4 = findPeakTowerIndices(test4);
        System.out.println("Test 4 (Expected []):     " + result4);

        // Test Case 5: Negative values
        int[] test5 = {-50, -10, -20, -5, -30};
        List<Integer> result5 = findPeakTowerIndices(test5);
        System.out.println("Test 5 (Expected [1, 3]): " + result5);
    }
}