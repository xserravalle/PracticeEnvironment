import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntegerOps {
    public static void main(String[] args) {
        int count = 0;

        // INSTANTIATE NEW ArrayList numbers
        System.out.println("Creating new ArrayList numbers");
        ArrayList<Integer> numbers = new ArrayList<>();

        // ADD NUMBERS TO ArrayList
        System.out.println("Populating ArrayList numbers with numbers");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        // PRINT CONTENTS OF ArrayList
        System.out.println(numbers);

        // SHUFFLE CONTENTS OF ArrayList
        System.out.println("Using Collections library, shuffle contents of ArrayList");
        Collections.shuffle(numbers);

        // PRINT SHUFFLED CONTENTS OF ArrayList;
        System.out.println("Printing shuffled contents of ArrayList");
        System.out.println(numbers);

        // TRAVERSE ArrayList TO PERFORM BASIC EVALUATION TO SORT ArrayList CONTENTS FROM LOW TO HIGH
        // THIS IS A BUBBLE SORT -- IN-PLACE COMPARISON SORTING ALGORITHM

        System.out.println("Sorting ArrayList using bubble sort:");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            count++;
            for (int i = 0; i < numbers.size() - 1; i++) {
                int compare1 = numbers.get(i);
                int compare2 = numbers.get(i + 1);
                if (compare1 < compare2) {
                    continue;
                } else if (compare1 > compare2) {
                    numbers.set(i, compare2);
                    numbers.set(i + 1, compare1);

                    isSorted = false;
                    System.out.println(numbers);
                }
            }
        }

        System.out.println("It took " + count + " passes to sort the ArrayList contents.");
        System.out.println(numbers);

        // CLEAR CONTENTS OF THE ArrayList

        System.out.println("Clearing out the contents of the ArrayList");
        numbers.clear();

        // PRINT CONTENTS OF CLEARED ArrayList TO ENSURE THEY'VE BEEN CLEARED
        System.out.println("Print contents of the ArrayList to ensure they've been cleared");
        System.out.println(numbers);

        // ADD NEW SET OF MIXED NEGATIVE AND POSITIVE INTEGERS TO ArrayList
        numbers.add(-10);
        numbers.add(20);
        numbers.add(-30);
        numbers.add(40);
        numbers.add(-50);
        numbers.add(60);
        numbers.add(-70);

        // PRINT CONTENTS OF ArrayList TO VIEW WHAT WE'RE WORKING WITH
        System.out.println(numbers);

        // TRAVERSE ArrayList AND TURN NEGATIVE VALUES TO POSITIVE VALUES USING Math.abs
        int value = 0;

        System.out.println("Traversing ArrayList to evaluate whether the number is negative");
        System.out.println("If negative, use Math.abs to obtain the absolute value, and set");
        System.out.println("the value at that index to the new positive value");
        for (int i = 0;i<numbers.size();i++) {
            value = numbers.get(i);
            if (value < 0) {
                value = Math.abs(value);
                numbers.set(i, value);
            } else {
                continue;
            }
        }

        System.out.println("Print the contents of ArrayList to ensure negatives have been turned positive");
        System.out.println(numbers);
    }
}
