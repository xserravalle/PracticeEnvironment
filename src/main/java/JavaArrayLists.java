import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class JavaArrayLists {
    public static void main(String[] args) {
        // INSTANTIATE ArrayList alistNumbers
        ArrayList<Integer> alistNumbers = new ArrayList();

        // COUNT CONTROLLED FOR LOOP TO POPULATE alistNumbers from 0-8
        for(int i=0;i<9;i++) {
            alistNumbers.add(i);
        }

        // PRINT THE CONTENTS OF alistNumbers
        System.out.println("Print the numbers contained in the Array List");
        System.out.println(alistNumbers);

        // REPLACE THE CONTENTS OF INDEX [7] WITH THE NUMBER 10
        System.out.println("Replace contents of index [7] with the number 10");
        alistNumbers.set(7, 10);
        System.out.println(alistNumbers);

        // REPLACE CONTENTS OF INDEX [7] WITH THE NUMBER 7
        System.out.println("Replace contents of index [7] with the number 7");
        alistNumbers.set(7, 7);
        System.out.println(alistNumbers);

        // REMOVE THE LAST ELEMENT OF THE ArrayList USING .removeLast();
        System.out.println("Remove the last element in the ArrayList using .removeLast()");
        alistNumbers.removeLast();
        System.out.println(alistNumbers);

        // ADD ELEMENT BACK TO END OF THE ArrayList USING .add();
        System.out.println("Add an element to the end of the ArrayList using .add()");
        alistNumbers.add(77);
        System.out.println(alistNumbers);

        // CHECK TO SEE IF THE ELEMENT 29 EXISTS IN THE ArrayList USING BOOLEAN
        System.out.println("Create boolean operator to determine whether the ArrayList contains 29");
        boolean hasTwentyNine = alistNumbers.contains(29);
        if (!hasTwentyNine) {
            System.out.println("This ArrayList DOES NOT CONTAIN the number 29.");
            System.out.println("The boolean value hasTwentyNine is FALSE.");
        } else {
            System.out.println("This ArrayList DOES CONTAIN the number 29.");
            System.out.println("The boolean value hasTwentyNine is TRUE.");
        }

        // ADD THE ELEMENT 29 TO THE END OF THE ArrayList AND CHECK IT AGAIN
        System.out.println("Adding element 29 to the end of the ArrayList to get the loop to evaluate to TRUE");
        alistNumbers.add(29);
        hasTwentyNine = alistNumbers.contains(29);
        if (!hasTwentyNine) {
            System.out.println("This ArrayList DOES NOT CONTAIN the number 29.");
            System.out.println("The boolean value hasTwentyNine is FALSE.");
        } else {
            System.out.println("This ArrayList DOES CONTAIN the number 29.");
            System.out.println("The boolean value hasTwentyNine is TRUE.");
        }

        // EMPTY THE ArrayList USING .clear()
        System.out.println("Clearing out the ArrayList using .clear()");
        alistNumbers.clear();
        System.out.println(alistNumbers);

        // REFILL THE ArrayList WITH RANDOM INTEGER VALUES
        // USING Random LIBRARY, CREATE NEW rand OBJECT
        // INSTANTIATE valueToAdd AS A RANDOMLY GENERATED INTEGER IN THE RANGE OF 0 TO 100
        // USING COUNT CONTROLLED FOR LOOP, ADD IT TO ArrayList
        System.out.println("Generating random integer values to populate new values within the ArrayList");
        for(int i = 0;i < 8;i++) {
            Random rand = new Random();
            int valueToAdd = rand.nextInt(0, 100);
            alistNumbers.add(valueToAdd);
        }
        System.out.println("Print the contents of alistNumbers to view values generated");
        System.out.println(alistNumbers);

        // SORT VALUES OF alistNumbers NUMERICALLY FROM SMALLEST TO LARGEST
        // THIS OPERATION REQUIRES INCLUSION OF Collections LIBRARY
        System.out.println("Using Collections library, sort alistNumbers");
        Collections.sort(alistNumbers);
        System.out.println("Print sorted contents of alistNumbers");
        System.out.println(alistNumbers);

        // REVERSE CONTENTS OF ArrayList USING Collections.reverse
        Collections.reverse(alistNumbers);
        System.out.println("Print reversed contents of alistNumbers");
        System.out.println(alistNumbers);

        // RANDOMIZE CONTENTS OF ArrayList USING Collections.shuffle
        Collections.shuffle(alistNumbers);
        System.out.println("Print shuffled contents of alistNumbers");
        System.out.println(alistNumbers);

        // CLEAR OUT CONTENTS OF alistNumbers
        System.out.println("Clearing contents of alistNumbers");
        alistNumbers.clear();

        // INSTANTIATE NEW ArrayList alistNumbers2
        System.out.println("Instantiating another ArrayList: alistNumbers2");
        ArrayList<Integer> alistNumbers2 = new ArrayList();

        // SHOW CONTENTS OF BOTH ArrayLists
        System.out.println("Printing contents of alistNumbers");
        System.out.println(alistNumbers);
        System.out.println("Printing contents of alistNumbers2");
        System.out.println(alistNumbers2);

        // POPULATE ArrayList alistNumbers USING RANDOM INTEGERS
        System.out.println("Populating alistNumbers with random integers");
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int valueToAdd = rand.nextInt(0, 9);
            alistNumbers.add(valueToAdd);
        }

        // POPULATE ArrayList alistNumbers2 USING RANDOM INTEGERS
        System.out.println("Populating alistNumbers2 with random integers");
        for (int i =0; i < 5; i++) {
            Random rand = new Random();
            int valueToAdd = rand.nextInt(0, 9);
            alistNumbers2.add(valueToAdd);
        }

        // PRINT CONTENTS OF alistNumbers AND alistNumbers2
        System.out.println(alistNumbers);
        System.out.println(alistNumbers2);

        // COMBINE CONTENTS OF alistNumbers AND alistNumbers2 INTO alistCombined USING .addAll
        System.out.println("Creating new ArrayList alistCombined to include contents of");
        System.out.println("alistNumbers and alistNumbers2");
        ArrayList<Integer> alistCombined = new ArrayList();
        alistCombined.addAll(alistNumbers);
        alistCombined.addAll(alistNumbers2);
        System.out.println("Printing contents of alistCombined");
        System.out.println(alistCombined);
    }
}
