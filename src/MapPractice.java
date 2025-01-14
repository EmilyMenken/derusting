import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map

  Map<String, Integer> hashBrownMap = new HashMap<>();
  

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)

    hashBrownMap.put("Light", 0);
    hashBrownMap.put("Golden", 1);
    hashBrownMap.put("Crispy", 2);
System.out.println("Map printed: " + hashBrownMap);

    // Get the value associated with a given key in the Map
  String key = "Golden";
    Integer value = hashBrownMap.get(key);
    System.out.println("The value associated with given key: " + key + ", is: " + value +"!");


    // Find the size (number of key/value pairs) of the Map

    int size = hashBrownMap.size();
    System.out.println("Map Size: " + size);

    // Replace the value associated with a given key (the size of the Map should not change)

    hashBrownMap.put("Crispy", 20);

    // Check whether the Map contains a given key

    String keyToCheck = "Light";
    if (hashBrownMap.containsKey(keyToCheck)) {
        System.out.println("The does map contains the key: " + keyToCheck);
    } else {
        System.out.println("The map doesn't contain the key: " + keyToCheck);
    }
    
  
    // Check whether the Map contains a given value

    int valueToCheck = 20;

    if (hashBrownMap.containsValue(valueToCheck)) {
        System.out.println("The map does contains the value: " + valueToCheck);
    } else {
        System.out.println("The map doesn't contain the value: " + valueToCheck);
    }

    // Iterate over the keys of the Map, printing each key

    for (String printKey : hashBrownMap.keySet()) {
      System.out.println(printKey +"!");
  }

    // Iterate over the values of the map, printing each value

    for (Integer printValue : hashBrownMap.values()) {
      System.out.println(printValue);
    }
    // Iterate over the entries in the map, printing each key and value

    for (String allKeys : hashBrownMap.keySet()) {
      Integer allValues = hashBrownMap.get(allKeys);
      System.out.println("Key: " + allKeys + ", Value: " + allValues);
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
