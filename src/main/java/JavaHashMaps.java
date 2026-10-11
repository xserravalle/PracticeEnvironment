import java.util.HashMap;
import java.util.Map;

// EXPLORING HashMaps BY APPLYING THE CONCEPT OF AN INVENTORY COUNT VALUE ASSOCIATED WITH AN INVENTORY ITEM KEY.
// I WILL APPROACH THIS USING the HashMap AS A CHARACTER'S INVENTORY IN A RPG.

public class JavaHashMaps {
    public static void main(String[] args) {
        // INSTANTIATE inventory HASHMAP WITH STRING VALUE FOR ITEM NAME AND INTEGER FOR INVENTORY COUNT
        Map<String, Integer> inventory = new HashMap<>();

        // POPULATE HASHMAP USING inventory.put("Key", value)
        inventory.put("Longsword", 1);
        inventory.put("Leather Armor", 1);
        inventory.put("Buckler", 1);
        inventory.put("Heal Potion", 5);
        inventory.put("Fireball Scroll", 2);

        System.out.println("Showing contents of character inventory: ");
        // PRINT CONTENTS OF INVENTORY. OUTPUT WILL BE item=value
        System.out.println(inventory);
        System.out.println("Showing size of character inventory: " + inventory.size());

        // LET'S SAY WE WANT TO SEE EXACTLY HOW MANY HEAL POTIONS WE HAVE IN INVENTORY.
        // USE inventory.get(key) TO RETRIEVE THE ASSOCIATED VALUE
        System.out.println("Number of heal potions in inventory: ");
        System.out.println("Heal potions: " + inventory.get("Heal Potion"));

        // LET'S SAY WE WANT TO CONFIRM WHETHER FIREBALL SCROLLS ARE IN OUR INVENTORY.
        // USE inventory.containsKey("Fireball Scroll") TO CHECK.
        System.out.println("Are there Fireball Scrolls in our inventory?");
        System.out.println("Fireball scrolls exist in inventory: " + inventory.containsKey("Fireball Scroll"));

        // THERE'S A BETTER WAY TO DISPLAY THE INVENTORY INFORMATION IN A MORE DIGESTIBLE WAY.
        // TRAVERSE THE HASHMAP USING AN ENHANCED FOR LOOP TO HAVE MORE CONTROL OF HOW THE ITEMS AND QUANTITIES
        // DISPLAY WHEN PRINTED TO OUTPUT.
        // for (Map.Entry<String, Integer> entry : inventory.entrySet())
        // SET STRING VALUE FOR item USING entry.getKey()
        // SET INTEGER VALUE FOR quantity USING entry.getValue()
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String item = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println(item + " -> " + quantity);
        }

        // REMOVE ALL ITEMS FROM THE INVENTORY USING .clear()
        // CONFIRM CONTENTS ARE EMPTY WITH OUTPUT
        inventory.clear();
        System.out.println("Inventory size after clearing: " + inventory.size());
    }
}
