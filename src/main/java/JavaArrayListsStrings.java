import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayListsStrings {
    public void main(String[] args) {
        // INSTANTIATE NEW ArrayList alistStrings
        ArrayList<String> alistStrings = new ArrayList();

        // POPULATE alistStrings WITH STRINGS
        alistStrings.add("apple");
        alistStrings.add("banana");
        alistStrings.add("cherry");

        // PRINT alistStrings
        System.out.println(alistStrings);

        // REMOVE LAST ELEMENT OF alistStrings
        alistStrings.removeLast();

        // PRINT alistStrings
        System.out.println(alistStrings);

        // CLEAR CONTENTS OF alistStrings
        alistStrings.clear();

        // INSTANTIATE NEW STRING APPLE
        String apple = "apple";
    }
}
