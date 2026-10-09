import java.util.Arrays;
import java.util.List;

public class JavaTriplets {
    public static long countTriplets(List<Integer> arr, int d) {
        int n = arr.size();
        long count = 0;

        for (int i=0; i < n-2; i++) {

            int remI = ((arr.get(i) % d) + d) % d;

            int[] frequency = new int[d];

            for (int j=i+1; j < n; j++) {

                int remJ = ((arr.get(j) % d) + d) % d;

                int targetRem = (d - ((remI + remJ) % d)) % d;

                count += frequency[targetRem];
                frequency[remJ]++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> testArr = Arrays.asList(3, 3, 4, 7, 8);

        int d = 5;

        System.out.println("Input array: " + testArr);
        System.out.println("Divisor (d): " + d);
        System.out.println("");

        long result = countTriplets(testArr, d);
        System.out.println("Total valid triplets: " + result);
    }
}
