import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {
        // INSTANTIATE numbersArray WITH ELEMENTS
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7};

        // ITERATE THROUGH THE ARRAY PRINTING OUT EACH ELEMENT
        System.out.println("Iterating through numbersArray:");
        for (int i=0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // CREATE A COPY OF numbersArray USING LIBRARY FUNCTION Arrays.copyOf(numbersArray, numbersArray.length +1);
        // THIS CREATES AN ARRAY WITH AN ADDITIONAL SPACE FOR A NEW ELEMENT
        numbersArray = Arrays.copyOf(numbersArray, numbersArray.length + 1);

        // ITERATE THROUGH THE ARRAY PRINTING OUT EACH ELEMENT
        // THE ADDED INDEX LENGTH WILL SHOW AS 0
        System.out.println("Iterating through numbersArray with new slot for incoming added element");
        System.out.println("Added index at the end of the array will show as 0, because a value");
        System.out.println("has not yet been added to it:");
        for (int i=0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // int PLACEHOLDER FOR NEW ARRAY ELEMENT
        System.out.println("Creating an int newElement with a value of 8 to be placed");
        System.out.println("at the end of the array");
        int newElement = 8;
        System.out.println("Value of newElement: " + newElement);

        // ADD THE ELEMENT AT numbersArray.length - 1 TO PLACE newElement AT THE END OF THE ARRAY
        System.out.println("Add the incoming element at the end of the array");
        numbersArray[numbersArray.length - 1] = newElement;

        // ITERATE THROUGH ARRAY TO ENSURE THAT THE ELEMENT HAS BEEN ADDED
        System.out.println("Iterating through numbersArray:");
        for (int i=0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // REMOVE THE ELEMENT ADDED FROM THE END OF THE ARRAY
        // INSTANTIATE AN int TO DENOTE THE SIZE OF THE ARRAY
        // INSTANTIATE targetIndex TO DENOTE THE DESIRED INDEX LOCATION TO REMOVE
        System.out.println("Remove added element from the end of the array, and shrink the array");
        int size = numbersArray.length;
        int targetIndex = numbersArray.length-1;

        // TRAVERSE THE INDEX TO MOVE EACH INDEX ACCORDINGLY
        for (int i=targetIndex; i < size-1; i++) {
            numbersArray[i] = numbersArray[i + 1];
        }

        // CLEAR THE LAST ELEMENT
        numbersArray[size - 1] = 0;

        // DECREMENT size
        size--;

        // ITERATE THROUGH ARRAY TO ENSURE THAT THE ELEMENT HAS BEEN SET TO ZERO
        System.out.println("Iterating through numbersArray to ensure last element is set to zero");
        for (int i=0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // CREATE COPY OF numbersArray TO SHRINK BACK TO ORIGINAL SIZE
        numbersArray = Arrays.copyOf(numbersArray, numbersArray.length - 1);

        // ITERATE THROUGH ARRAY TO ENSURE THAT THE ELEMENT HAS BEEN REMOVED
        System.out.println("Iterating through numbersArray:");
        for (int i=0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
