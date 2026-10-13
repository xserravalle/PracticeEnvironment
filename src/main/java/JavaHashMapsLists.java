import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class JavaHashMapsLists {
    // INSTANTIATE ITEM OBJECT FOR GLOBAL USE OUTSIDE OF MAIN USING NECESSARY FIELDS
    // IN THIS CASE, int id, String name, String description, int value
    public record Item(int id, String name, String description, int value) {}

    public static void main(String[] args) {
        // INSTANTIATE ITEM OBJECTS WITH WHICH TO POPULATE itemCatalog HASH MAP
        Item item001 = new Item(1, "Heal Potion", "A potion of healing", 5);
        Item item002 = new Item(2, "Mana Potion", "A potion of mana", 5);
        Item item003 = new Item(3, "Fireball Scroll", "A magic Fireball scroll", 10);

        // INSTANTIATE HASHMAP TO HOLD ITEM OBJECTS, USING AN INTEGER AS THE KEY INDEX AND THE ITEM OBJECT
        // AS THE VALUE SET OF OBJECTS WITH THEIR ATTRIBUTES CONSTITUTING THE KEY-VALUE PAIRS
        Map<Integer, Item> itemCatalog = new HashMap<>();
        itemCatalog.put(item001.id(), item001);
        itemCatalog.put(item002.id(), item002);
        itemCatalog.put(item003.id(), item003);

        // TRAVERSE THE HASHMAP USING ITEM INDEX KEY TO OBTAIN THE VALUES TO DISPLAY
        for (Map.Entry<Integer, Item> itemEntry : itemCatalog.entrySet()) {
            Item item = itemEntry.getValue();
            System.out.println("-----------------------------------------------");
            System.out.println("Item catalog entry: Item " + itemEntry.getKey());
            System.out.println("Value-paired item ID: " + item.id());
            System.out.println("Item name: " + item.name());
            System.out.println("Item GP value: " + item.value());
            System.out.println("-----------------------------------------------");
        }
    }
}
