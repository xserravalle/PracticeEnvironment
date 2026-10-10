import java.util.Set;
import java.util.HashSet;
import java.lang.Object;

// NOTE ON HASHSETS: HASHSETS ARE BACKED BY COLLECTIONS IN THE SAME WAY THAT ARRAYLISTS ARE BACKED BY COLLECTIONS.
// HASHSETS WILL PROVIDE A HASH VALUE TO DETERMINE THEIR LOCATION IN MEMORY. FOR DEDUPLICATION, YOU CAN TAKE AN
// ARRAY, A STRUCTURE WITH A FIXED VALUE, AND THEN DUMP THE CONTENTS INTO A HASHSET, WHICH AUTOMATICALLY STRIPS OUT
// DUPLICATED VALUES.

public class JavaHashSets {
    public static void main(String[] args) {
        // INSTANTIATE HashSet numbers TO CONTAIN INTEGER VALUES
        System.out.println("Instantiating new HashSet numbers to contain integer values");
        Set<Integer> numbers = new HashSet<>();

        // POPULATE HashSet WITH INTEGER VALUES
        System.out.println("Populating numbers HashSet with integer values");
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(15); // ADDING A DUPLICATE TO TEST UNIQUE VALUES
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Printing out values of HashSet numbers:");

        // NOTE THAT HashSet CONTENTS ARE NOT INDEXED LIKE ArrayList CONTENTS, WHERE EACH ITEM
        // APPEARS AT A SPECIFIC INDEX. DETERMINISTIC MATH IS USED TO DETERMINE A HASHCODE
        // TO ASSIGN A MEMORY SPOT TO THAT ADDED ITEM.
        System.out.println(numbers);

        // USE A PRIMITIVE int WHEN YOU ARE PERFORMING COMPUTATION AND MATH. IF YOU NEED TO RUN
        // OBJECT CAPABILITIES (.hashCode() etc.) USE A WRAPPER CLASS. NOTE THAT WITH AN int
        // THE VALUE FOR THE HASH CODE IS JUST THE INTEGER ITSELF. ALSO NOTE HERE THE DUPLICATE
        // INTEGER VALUE OF 15 DOES NOT SHOW UP.

        // ITERATE THROUGH numbers AND OUTPUT EACH number WITH ITS ASSIGNED HASHCODE USING AN
        // ENHANCED FOR EACH LOOP
        System.out.println("Iterating through numbers to output number with assigned hashcode");
        for (Integer number : numbers) {
            System.out.println("Processing: " + number + " || HashCode: " + number.hashCode());
        }

        // SHOW THE SIZE OF THE HashSet
        System.out.println("Size of HashSet numbers: " + numbers.size());

        // INSTANTIATE HashSet strings TO INCLUDE STRINGS
        System.out.println("Instantiate HashSet strings to contain strings");
        Set<String> strings = new HashSet<>();

        // POPULATE strings WITH STRING VALUES, INCLUDING A DUPLICATE
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("cherry");
        strings.add("peach");
        strings.add("melon");

        // ITERATE THROUGH strings AND OUTPUT EACH string WITH ITS ASSIGNED HASHCODE. NOTE THE DIFFERENCE
        // IN HASHED VALUE FOR INTEGERS VS. HASHED VALUE FOR STRINGS
        System.out.println("Iterating through strings to output string with assigned hashcode");
        System.out.println(strings);
        for (String string : strings) {
            System.out.println("Processing: " + string + " || HashCode: " + string.hashCode());
        }

        System.out.println("Size of HashSet numbers: " + strings.size());

        // CHECK TO SEE IF THE HASH SETS CONTAIN A PARTICULAR VALUE
        System.out.println("Check numbers to see if it contains 10: " + numbers.contains(10));
        System.out.println("Check numbers to see if it contains 77: " + numbers.contains(77));
        System.out.println("Check strings to see if it contains apple: " + strings.contains("apple"));
        System.out.println("Check strings to see if it contains broccoli: " + strings.contains("broccoli"));

        // REMOVE ELEMENTS FROM THE HASH SETS
        System.out.println("Removing 20 from numbers:");
        numbers.remove(20);
        System.out.println(numbers);
        System.out.println("Removing banana from strings:");
        strings.remove("banana");
        System.out.println(strings);
    }

}
