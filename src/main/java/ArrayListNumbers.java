import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class ArrayListNumbers {
    public static void main(String[] args) {
        // INSTANTIATE numbers ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // POPULATE numbers WITH NUMBERS
        System.out.println("Populating ArrayList numbers with numbers");
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        // PRINT CONTENTS OF numbers
        System.out.println(numbers);

        // SHUFFLE CONTENTS OF numbers
        System.out.println("Use Collections.shuffle to shuffle numbers");
        Collections.shuffle(numbers);

        // PRINT SHUFFLED CONTENTS OF numbers
        System.out.println("Print shuffled numbers");
        System.out.println(numbers);

        // ITERATE THROUGH numbers USING COUNT CONTROLLED FOR LOOP
        // IDENTIFY THE NUMBER OF OCCURRENCES OF A PARTICULAR TARGET
        // FOR THE PURPOSE OF THIS EXERCISE, USE 30

        int target = 30;
        System.out.println("Matching contents of numbers to target of: " + target);

        for (int i = 0; i<numbers.size();i++) {
            int current = numbers.get(i);

            if (current == target) {
                System.out.println("The number " + numbers.get(i) + " at index " + i + " MATCHES TARGET.");
            } else {
                System.out.println("The number " + numbers.get(i) + " at index " + i + " DOES NOT MATCH TARGET.");
            }
        }

        // NOW, CONVERT THE ArrayList to an Array

        System.out.println("Converting ArrayList numbers to an Array using numbers.toArray");
        Integer[] numbersArray = numbers.toArray(new Integer[0]);

        // TRAVERSE THE ARRAY TO PRINT ARRAY CONTENTS AND INDEX

        for (int i = 0;i<numbersArray.length;i++) {
            System.out.println("Number: " + numbersArray[i] + ", Index: " + i);
        }

        // TRAVERSE THE ARRAY TO MATCH INTEGERS AT INDEX i TO target2

        System.out.println("Traversing array numbersArray to match numbers at index i to target2");
        for (int i = 0; i < numbersArray.length; i++) {
            int target2 = 20;
            int current = numbersArray[i];

            if (current == target2) {
                System.out.println("The number " + numbersArray[i] + " at index " + i + " MATCHES TARGET.");
            } else {
                System.out.println("The number " + numbersArray[i] + " at index " + i + " DOES NOT MATCH TARGET.");
            }
        }

        // CONVERT numbersArray TO ArrayList USING Arrays.asList

        System.out.println("Convert array numbersArray to ArrayList");
        ArrayList<Integer> newNumbersArrayList = new ArrayList<>(Arrays.asList(numbersArray));

        // PRINT CONTENTS OF ArrayList newNumbersArrayList
        System.out.println(newNumbersArrayList);
    }
}
