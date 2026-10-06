/**
 * SCENARIO: Tower Handshake Frequency & Anomaly Detection
 * DISCIPLINES: HASH MAPS, SETS
 * -----------------------------------------------------------------------------
 * Context:
 * In a cellular network monitoring subsystem, base stations log connection
 * handshakes from mobile devices. Network engineers need to isolate active
 * transmitting devices that cross a minimum communication volume threshold.
 *
 * Objective:
 * Given a list of raw device IDs and a minimum threshold (minEvents), aggregate
 * the frequency of each device, filter out devices below the threshold, and
 * sort the qualifying devices.
 *
 * Sorting & Formatting Rules:
 * 1. Primary Sort: Event frequency descending (highest volume first).
 * 2. Secondary Sort (Tie-Breaker): Alphabetical/lexicographical ascending ('dev_A' before 'dev_Z').
 * 3. Deduplication: Output list contains unique device IDs only.
 * 4. Input Validation: Return an empty list if deviceIds is null, empty, or minEvents <= 0.
 *
 * Algorithmic Strategy:
 * - Map Accumulation: Use HashMap<String, Integer> with getOrDefault() for O(1) tallies.
 * - Map.Entry Filtering: Stream or loop over entrySet() to gather keys meeting minEvents.
 * - Custom Comparator: Use Collections.sort() with multi-level comparison:
 *     Integer.compare(freqB, freqA) for descending count.
 *     a.compareTo(b) for alphabetical tie-break.
 * - Time Complexity:  O(N + K log K) where N is raw input size and K is qualifying devices.
 * - Space Complexity: O(U) where U is the count of distinct device IDs in memory.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandshakeFrequency {

    public static List<String> analyzeHandshakes(List<String> deviceIds, int minEvents) {
        List<String> result = new ArrayList<>();

        // Guard clause: validate inputs
        if (deviceIds == null || deviceIds.isEmpty() || minEvents <= 0) {
            return result;
        }

        // Step 1: Count occurrences using a HashMap
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String id : deviceIds) {
            frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
        }

        // Step 2: Filter devices meeting or exceeding minEvents
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= minEvents) {
                result.add(entry.getKey());
            }
        }

        // Step 3: Sort with custom tie-breaker logic
        // Primary: Frequency descending
        // Secondary: Device ID string ascending (alphabetical)
        Collections.sort(result, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);

            if (freqA != freqB) {
                return Integer.compare(freqB, freqA); // Descending order
            }
            return a.compareTo(b); // Ascending alphabetical order
        });

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1: Varying frequencies
        List<String> test1 = Arrays.asList("dev_B", "dev_A", "dev_B", "dev_C", "dev_A", "dev_B");
        System.out.println("Test 1 (Expected [dev_B, dev_A]): " + analyzeHandshakes(test1, 2));

        // Test Case 2: Tied frequencies requiring alphabetical fallback
        List<String> test2 = Arrays.asList("dev_Z", "dev_A", "dev_Z", "dev_A");
        System.out.println("Test 2 (Expected [dev_A, dev_Z]): " + analyzeHandshakes(test2, 2));

        // Test Case 3: Threshold higher than any element's count
        List<String> test3 = Arrays.asList("dev_1", "dev_2", "dev_1");
        System.out.println("Test 3 (Expected []):             " + analyzeHandshakes(test3, 5));

        // Test Case 4: Null list protection
        System.out.println("Test 4 (Expected []):             " + analyzeHandshakes(null, 1));
    }
}