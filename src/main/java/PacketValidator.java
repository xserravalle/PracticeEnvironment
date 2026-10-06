/**
 * SCENARIO: Telemetry Packet Identifier Validation
 * DISCIPLINES: STRINGS, TWO-POINTERS
 * -----------------------------------------------------------------------------
 * Context:
 * In a telecommunications routing subsystem, raw packet payloads are prefixed
 * with an alphanumeric token. The gateway validator must verify that the token
 * is syntactically well-formed before the packet is routed to downstream microservices.
 *
 * Objective:
 * Determine whether a given token string forms a valid palindrome, evaluating
 * only alphanumeric characters and ignoring case sensitivity.
 *
 * Boundary & Business Rules:
 * 1. Character Filtering: Non-alphanumeric symbols (punctuation, whitespace,
 *    underscores, dashes) are ignored entirely during inspection.
 * 2. Case Insensitivity: Letters are evaluated without regard to casing
 *    ('A' matches 'a').
 * 3. Trivial Strings: An empty string ("") or a string containing only
 *    non-alphanumeric characters (e.g., ".,:; ") evaluates to true.
 * 4. Null References: A null input token is invalid and must return false.
 *
 * Algorithmic Strategy:
 * - Two-Pointer Technique: Initialize 'left' at index 0 and 'right' at index (length - 1).
 * - Advance indices inward, skipping non-alphanumeric characters using
 *   Character.isLetterOrDigit().
 * - Compare characters in-place using Character.toLowerCase() to avoid heap allocations
 *   (e.g., no regex replaceAll or StringBuilder allocations).
 * - Time Complexity:  O(N) — single pass where each character is visited at most twice.
 * - Space Complexity: O(1) auxiliary memory.
 */

public class PacketValidator {

    /**
     * Verifies if a string is a palindrome considering only alphanumeric characters
     * and ignoring case sensitivity.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1) auxiliary
     */
    public static boolean isValidRoutingToken(String token) {
        // Guard clause: null input
        if (token == null) {
            return false;
        }

        // left and right are used in this instance as POINTERS
        // left starts at the beginning of the string
        // right starts at the end of the string

        int left = 0;
        int right = token.length() - 1;

        // while the value of left (the pointer at index 0) is less than the value of
        // right (the pointer at index length-1 **THIS ACCOUNTS FOR THE INDEX BEGINNING
        // AT 0**, the operation proceeds

        while (left < right) {
            char leftChar = token.charAt(left);
            char rightChar = token.charAt(right);

            // Skip non-alphanumeric characters on the left
            // Only evaluates digits and letters, excludes symbols
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters on the right
            // Only evaluates digits and letters, excludes symbols
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Case-insensitive character comparison
            // Evaluates whether the characters are the same. If not, returns false
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            // Advance both pointers inward after a valid match
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test Case 1: Valid mixed-case with punctuation
        String t1 = "A12-b: B21_a";
        System.out.println("Test 1 (Expected true):  " + isValidRoutingToken(t1));

        // Test Case 2: Non-palindrome
        String t2 = "att_5g_network";
        System.out.println("Test 2 (Expected false): " + isValidRoutingToken(t2));

        // Test Case 3: Only punctuation/whitespace
        String t3 = ".,:; ";
        System.out.println("Test 3 (Expected true):  " + isValidRoutingToken(t3));

        // Test Case 4: Single character
        String t4 = "x";
        System.out.println("Test 4 (Expected true):  " + isValidRoutingToken(t4));

        // Test Case 5: Empty string
        String t5 = "";
        System.out.println("Test 5 (Expected true):  " + isValidRoutingToken(t5));

        // Test Case 6: Null input
        String t6 = null;
        System.out.println("Test 6 (Expected false): " + isValidRoutingToken(t6));
    }
}