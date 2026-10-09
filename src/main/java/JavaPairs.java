import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaPairs {
    // FUNCTION DESIGNED TO ACCEPT A LIST OF INTEGERS (projectCosts) AND COMPARE THEM TO THE TARGET
    // WHEN THE FUNCTION IS DECLARED, ESTABLISH THAT THE VALUE target IS AN INTEGER IN THE DECLARATION
    // AND CONFIRM THAT AN INTEGER IS EXPECTED TO BE PASSED INTO THE FUNCTION WITH int target
    public static int countPairs(List<Integer> projectCosts, int target) {
        // SET THE VALUE OF target TO THE ABSOLUTE VALUE OF target TO AVOID NEGATIVE INTEGERS
        target = Math.abs(target);

        // INSTANTIATE HashSet costs TO CONTAIN THE projectCosts PASSED INTO THE FUNCTION
        Set<Integer> costs = new HashSet<>(projectCosts);

        // INSTANTIATE count VARIABLE TO DETERMINE THE NUMBER OF COMPARISONS THAT SATISFY THE CONDITION
        int count = 0;

        // TRAVERSE SET OF cost IN costs TO DETERMINE THE VALUES THAT SATISFY THE CONDITION OUTLINED
        // IN TARGET MATHEMATICALLY
        for (int cost : costs) {
            if (costs.contains(cost + target)) {
                count++;
            }
        }

        // RETURN count OF VALUES THAT SATISFY THE CONDITION
        return count;
    }

    public static void main(String[] args) {
        // USE A List HERE BECAUSE IT IS BACKED WITH Collection FUNCTIONALITY WHICH AVOIDS USING TYPE CONVERSIONS
        // THAT WOULD BE REQUIRED IF THE DATA STRUCTURE WERE AN Array
        List<Integer> test1 = List.of(1, 3, 5);
        System.out.println("Test 1 Result: " + countPairs(test1, 2));
    }
}