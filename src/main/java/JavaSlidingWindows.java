import java.util.ArrayList;
import java.util.Arrays;

public class JavaSlidingWindows {
    public static void main(String[] args) {
        // INSTANTIATE ARRAY TO HOLD INTEGER VALUES
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // FIRST SLIDING WINDOW PASS -- BRUTE FORCING THE WINDOW
        // FOR LOOP TO ITERATE THROUGH THE ARRAY USING A SLIDING WINDOW OF i+2, BREAKING THE LOOP
        // IN THE INSTANCE THAT i+2 BECOMES GREATER THAN THE SIZE OF THE ARRAY. TIME COMPLEXITY
        // HERE IS O(n*k)
        System.out.println("First sliding window pass -- brute forced window");
        for (int i = 0; i < numbers.length; i++) {
            if (i + 2 > numbers.length - 1) {
                break;
            }
            // BRUTE FORCE THE "k=3" WINDOW WITH THE FIRST INDEX OF THE WINDOW BEING ASSIGNED TO int first
            // THE SECOND INDEX OF THE WINDOW BEING ASSIGNED TO int second AND THE THIRD INDEX BEING ASSIGNED
            // TO int third
            int first = numbers[i];
            int second = numbers[i + 1];
            int third = numbers[i + 2];
            int sum = first + second + third;
            System.out.println("Sum of " + first + " + " + second + "+ " + third + " = " + sum);
        }

        // SECOND SLIDING WINDOW PASS -- STREAMLINING THE CODE. UTILIZE THE SAME FOR LOOP, BUT CLEAN UP
        // AND TIGHTEN THE OPERATIONS MATHEMATICALLY. INTRODUCE VARIABLE k TO SIGNIFY THE SIZE OF THE
        // SLIDING WINDOW. TIME COMPLEXITY USING THIS METHODOLOGY IS O(n) WHERE n IS EQUAL TO THE NUMBER
        // OF VALUES IN THE ARRAY.
        System.out.println("Second sliding window pass -- brute forced window, but cleaner somehow");
        // k IS THE RANGE OF THE SLIDING WINDOW
        int k = 3;
        int currentSum = 0;

        // FOR LOOP TO TRAVERSE THE LENGTH OF THE ARRAY AND ADD THE VALUES WITHIN THE SLIDING WINDOW
        // RANGE.
        for (int i =0; i < numbers.length; i++) {
            // INITIAL PASSES WILL POPULATE THE INDEXED VALUES INTO THE SLIDING WINDOW RANGE k
            int incoming = numbers[i];
            currentSum += incoming;
            System.out.println("ADDED INDEX [" + i + "] || VALUE: " + incoming);

            // ONCE INDEX i IS GREATER THAN THE RANGE k, THE OUTGOING INDEX IS INSTANTIATED TO A VARIABLE
            // ALONG WITH IT'S CORRESPONDING VALUE (RESPECTIVELY, outgoingIndex AND outgoing) FOR THE PURPOSES
            // OF OUTPUT AND TRACKING AS ITERATION CONTINUES.
            if (i >= k) {
                int outgoingIndex = i - k;
                int outgoing = numbers[outgoingIndex];
                // SUBTRACT THE OUTGOING VALUE FROM currentSum. THE VALUE FOR THE INCOMING VALUE ABOVE IS WHAT
                // GOVERNS THE INCOMING VALUE BEING ADDED INTO CURRENT SUM. THE OUTPUT WILL DISPLAY THE INCOMING
                // VALUE AT THE INDEX THAT IS INCOMING WITHIN THE SLIDING WINDOW RANGE k.
                currentSum -= outgoing;
                System.out.println("DROPPED INDEX [" + outgoingIndex + "] || VALUE: " + outgoing);
            }

            // THE WINDOW RANGE k IS DETERMINED, NOTING THAT windowStart IS THE BEGINNING INDEX OF THE SLIDING
            // WINDOW RANGE k, AND i IS THE END INDEX VALUE OF THE SLIDING WINDOW. currentSum IS THEN OUTPUT
            // TO REFLECT THE SUM OF THE VALUES WITHIN THE CITED SLIDING WINDOW RANGE.
            if (i >= k - 1) {
                int windowStart = i - k + 1;
                System.out.println("WINDOW [" + windowStart + "] to [" + i + "] || HAS SUM: " + currentSum);
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }
}

// I AM ADDING A COMMENT BLOCK AT THE END OF THIS FILE BECAUSE GITHUB TRIED TO ROB ME OF MY SQUARE
// AND I NEED MY DOPAMINE HIT. - PTH 10/14/2026