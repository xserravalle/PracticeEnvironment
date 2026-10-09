import java.util.ArrayList;
import java.util.Collections;

public class JavaWarmup {
    public static void main(String[] args) {
        // WARMUP ARRAY
        int[] arrayNumbers = {5, 10, 15, 20, 25, 30};

        // WARMUP ARRAY TRAVERSAL
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Number at index " + i + ": " + arrayNumbers[i]);
        }

        System.out.println("");

        // WARMUP ARRAY TRAVERSAL BACKWARDS
        for (int i = arrayNumbers.length-1; i >= 0; i--) {
            System.out.println("Number at index " + i + ": " + arrayNumbers[i]);
        }

        int arrayTotal = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Adding number " + arrayNumbers[i] + " at index " + i + " to arrayTotal.");
            arrayTotal += arrayNumbers[i];
        }

        System.out.println("");
        System.out.println("Total of the numbers in arrayNumbers: " + arrayTotal);
        int arrayAverage = arrayTotal/arrayNumbers.length;
        System.out.println("Average of the numbers in arrayList: " + arrayAverage);
        System.out.println("");

        // WARMUP ARRAYLIST
        ArrayList<Integer> arraylistNumbers = new ArrayList<>();
        arraylistNumbers.add(5);
        arraylistNumbers.add(10);
        arraylistNumbers.add(15);
        arraylistNumbers.add(20);
        arraylistNumbers.add(25);
        arraylistNumbers.add(30);

        // TRAVERSE ARRAYLIST AND PRINT CONTENTS
        for (int i = 0; i < arraylistNumbers.size();i++) {
            System.out.println("Number in arraylist at index " + i + ": " + arraylistNumbers.get(i));
        }

        // TRAVERSE ARRAYLIST BACKWARDS AND PRINT CONTENTS
        for (int i = arraylistNumbers.size()-1; i>=0;i--) {
            System.out.println("Number in arraylist at index " + i + ": " + arraylistNumbers.get(i));
        }

        int arraylistTotal = 0;
        for (int i = 0; i < arraylistNumbers.size(); i++) {
            arraylistTotal += arraylistNumbers.get(i);
        }

        System.out.println("Total of the numbers in arraylistNumbers: " + arraylistTotal);
        int arraylistAverage = arraylistTotal/arraylistNumbers.size();
        System.out.println("Average of the numbers in arraylistNumbers: " + arraylistAverage);
    }
}
