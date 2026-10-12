import java.util.List;
import java.util.ArrayList;

// ADD BOTH LIST AND ARRAYLIST LIBRARIES. USE ARRAYLIST OPERATIONS TO INTERACT WITH THE LIST
// STRUCTURE. TRAVERSAL WILL BE SIMILAR TO ARRAYLIST OPERATIONS.

// IN WORKING WITH LISTS TO ADD A LIST OF VALUES (FOR VALUES IN KEY VALUE PAIRS THAT MAY HAVE
// MULTIPLE CHARACTERISTICS) UTILIZING LISTS IN THIS WAY IS A JAVA BEST PRACTICE.

public class JavaLists {
    // DECLARING record ITEM HERE TO BE USED INSIDE OF MAIN AS AN OBJECT BEING STORED INSIDE THE LIST
    // THIS WILL REPRESENT THE VALUES NECESSARY IN KEY-VALUE PAIRS IN A HASH MAP
    public record Item(String name, String description, int atkPwr) {}

    public static void main(String[] args) {
        // BEGINNING WITH THE BASICS, INSTANTIATE A JAVA LIST TO CONTAIN INTEGERS
        List<Integer> numbers = new ArrayList<>();

        // POPULATE LIST WITH INTEGERS
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // ITERATE THROUGH ARRAYLISTS USING YOUR CHOICE OF ITERATION STRUCTURES.. CAN USE ENHANCED FOR LOOPS
        // FOR TRAVERSAL, BUT BEST PRACTICE DICTATES USING A COUNT-CONTROLLED FOR LOOP FOR TRAVERSAL
        // IN INSTANCES WHEN YOU NEED TO DO SOMETHING LIKE REPORT BACK AN INDEX. THIS IS DUE TO TIME
        // COMPLEXITY CONCERNS.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }

        // CLEAR THE LIST
        numbers.clear();

        // NOW, CREATE A LIST THAT WILL INCLUDE OBJECTS. THIS WILL ALLOW PROPER LEVERAGE OF LISTS IN ORDER TO
        // INCORPORATE THEM WITH KEY-VALUE PAIRS FOR KEYS THAT WILL HAVE VALUES WITH MULTIPLE ATTRIBUTES.
        // IN THE INSTANCE OF THIS EXERCISE, GOING BACK TO WORKING WITH HASH MAPS THE FIRST TIME AROUND,
        // INVENTORY ITEMS IN AN RPG WERE USED.

        // IN THE HASHMAP APPROACH FOR ITEMS, THE KEY WILL BE THE ITEM ID, AND THE VALUE WILL BE A LIST
        // OF OBJECTS WITH PARTICULAR ATTRIBUTES.

        // FIRST, ESTABLISH THE ITEM OBJECT WITH THE ATTRIBUTES IT WILL INCLUDE. DO THIS USING record
        // A RECORD IS SIMILAR TO A JAVA DATA STRUCTURE IN THAT IT CAN BE ESTABLISHED WITH PARTICULAR
        // ATTRIBUTES.

        // NOTE THAT BEST PRACTICE IS TO DECLARE THE RECORD IN ITS OWN FILE, BUT FOR THE SAKE OF
        // THE EXERCISE, YOU WANT TO DECLARE RECORD OUTSIDE OF MAIN. THIS WILL BE ABOVE, AND
        // WILL USE THE SYNTAX BELOW:
        // public record RecordName(String attribute1, int attribute 2 , ...) {}
        List<Item> weapons = new ArrayList<>();

        // INSTANTIATE ITEM OBJECTS BY PASSING THE REQUIRED VALUES INTO THE INSTANTIATION STATEMENT
        Item ironLongsword = new Item("Iron Longsword", "An iron longsword", 5);
        Item steelLongsword = new Item("Steel Longsword", "A sharpened steel longsword", 10);
        Item mithrilLongsword = new Item("Mithril Longsword", "An exotic longsword crafted from mithril", 20);

        // ADD ITEM OBJECTS TO weapons LIST
        weapons.add(ironLongsword);
        weapons.add(steelLongsword);
        weapons.add(mithrilLongsword);

        // PRINT OBJECTS IN WEAPONS
        System.out.println(weapons);

        // ENHANCED FOR LOOP TO PRINT ALL ASSIGNED AND PASSED ATTRIBUTES OF WEAPON OBJECTS FOR OBJECTS
        // HELD INSIDE WEAPONS
        for (Item weapon : weapons) {
            System.out.println("------------------------------------------");
            System.out.println("Item name: " + weapon.name());
            System.out.println("Item description: " + weapon.description());
            System.out.println("Atk pwr: " + weapon.atkPwr());
            System.out.println("------------------------------------------");
        }
    }
}
