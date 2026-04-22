package app;

import model.ACCoach;
import model.Bogie;
import model.Coach;
import model.GeneralCoach;
import model.SleeperCoach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main application class for managing the Train Consist Application.
 * Entry point introducing dynamic collection list (ArrayList)
 * and basic OOP principles to manage Train coaches/bogies.
 */
public class TrainApp {

    /**
     * Program execution starts here.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Dynamic Initialization
        // Using List interface for Abstraction over dynamic collection (ArrayList)
        List<Coach> trainConsist = new ArrayList<>();

        // Display Initial Bogie Count
        System.out.println("Initial bogie count: " + trainConsist.size());
        
        // Simulating the addition of coaches dynamically using polymorphism
        System.out.println("\nAdding coaches to the consist...");
        trainConsist.add(new GeneralCoach("GEN-101"));
        trainConsist.add(new SleeperCoach("S1-201", 72));
        trainConsist.add(new ACCoach("B1-301", "3AC"));

        // Display new composition count
        System.out.println("Bogie count after addition: " + trainConsist.size());
        System.out.println("\n--- Current Train Consist ---");

        // Display coaches showing dynamic binding/polymorphism displaying coaches 
        for (Coach coach : trainConsist) {
            coach.display();
        }
        
        System.out.println("=====================================\n");
        
        // ============================================
        // UC2: Dynamic Insertion and Removal of Bogies
        // ============================================
        System.out.println("=== UC2: Manage Passenger Bogies (String List) ===");
        
        // 1. Create an ArrayList<String> for passenger bogies
        List<String> passengerBogies = new ArrayList<>();
        
        // 2. Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        
        // 3. Print the list after insertion
        System.out.println("Bogies after insertion: " + passengerBogies);
        
        // 4. Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("Removed 'AC Chair'.");
        
        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the list contain 'Sleeper'? " + hasSleeper);
        
        // 6. Print final list state
        System.out.println("Final passenger bogies list: " + passengerBogies);
        System.out.println("=====================================\n");
        
        // ============================================
        // UC3: Ensure no duplicate bogie IDs
        // ============================================
        System.out.println("=== UC3: Unique Bogie IDs (HashSet) ===");
        
        // 1. System inserts into HashSet
        Set<String> bogieIds = new HashSet<>();
        
        // 2. User adds bogie IDs
        System.out.println("Adding IDs: S-01, A-02, S-01, G-03");
        bogieIds.add("S-01");
        bogieIds.add("A-02");
        bogieIds.add("S-01"); // Duplicate - will be ignored
        bogieIds.add("G-03");
        
        // 3. Duplicates are ignored; Unique IDs are displayed
        System.out.println("Unique Bogie IDs in HashSet: " + bogieIds);
        System.out.println("Total unique IDs successfully registered: " + bogieIds.size());
        System.out.println("=====================================\n");
        
        // ============================================
        // UC4: Train Consist Chaining (LinkedList)
        // ============================================
        System.out.println("=== UC4: Train Node Management (LinkedList) ===");
        
        // 1. Create a LinkedList<String> for the consist
        LinkedList<String> trainChain = new LinkedList<>();
        
        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        trainChain.add("Engine");
        trainChain.add("Sleeper");
        trainChain.add("AC");
        trainChain.add("Cargo");
        trainChain.add("Guard");
        System.out.println("Initial chain: " + trainChain);
        
        // 3. Insert a Pantry Car at position 2
        trainChain.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at index 2: " + trainChain);
        
        // 4. Remove the first and last bogie
        trainChain.removeFirst(); // Removes Engine
        trainChain.removeLast();  // Removes Guard
        System.out.println("After removing Engine and Guard: " + trainChain);
        
        // 5. Display the final ordered train consist
        System.out.println("Final ordered train consist: " + trainChain);
        System.out.println("=====================================\n");
        
        // ============================================
        // UC5: Maintain insertion order while enforcing uniqueness
        // ============================================
        System.out.println("=== UC5: Ordered Unique Formation (LinkedHashSet) ===");
        
        // 1. Create a LinkedHashSet<String> to represent the train formation.
        Set<String> orderedFormation = new LinkedHashSet<>();
        
        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard.
        orderedFormation.add("Engine");
        orderedFormation.add("Sleeper");
        orderedFormation.add("Cargo");
        orderedFormation.add("Guard");
        System.out.println("Initial Ordered Formation: " + orderedFormation);
        
        // 3. Attempt to attach a duplicate bogie intentionally.
        System.out.println("Attempting to add duplicate 'Sleeper'...");
        boolean isSleeperAdded = orderedFormation.add("Sleeper");
        
        // 4. Display the final formation order
        System.out.println("Was 'Sleeper' added? " + isSleeperAdded);
        System.out.println("Final ordered unique train formation: " + orderedFormation);
        System.out.println("=====================================\n");
        
        // ============================================
        // UC6: Associate each bogie with its seating or load capacity
        // ============================================
        System.out.println("=== UC6: Bogie Capacity Mapping (HashMap) ===");
        
        // 1. Create a HashMap<String, Integer> to store bogie-capacity information.
        Map<String, Integer> bogieCapacities = new HashMap<>(); // Using Map interface
        
        // 2. Insert capacity values for bogies: Sleeper, AC Chair, First Class.
        // 3. Use the put() method to map each bogie to its capacity.
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 78);
        bogieCapacities.put("First Class", 24);
        
        System.out.println("Bogie-Capacity mapping inserted successfully.");
        System.out.println("\nIterating over map to display details:");
        
        // 4. Iterate over the map using entrySet() and display
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Name: " + entry.getKey() + " -> Capacity: " + entry.getValue() + " seats");
        }
        
        System.out.println("=====================================\n");
        
        // ============================================
        // UC7: Sort passenger bogies based on capacity
        // ============================================
        System.out.println("=== UC7: Custom Object Sorting (Comparator) ===");
        
        // 1. Create a List<Bogie> to store passenger bogies.
        List<Bogie> customBogies = new ArrayList<>();
        
        // 2. Add bogies: Sleeper, AC Chair, and First Class
        customBogies.add(new Bogie("Sleeper", 72));
        customBogies.add(new Bogie("AC Chair", 78));
        customBogies.add(new Bogie("First Class", 24));
        
        System.out.println("Before Sorting (Insertion Order):");
        for (Bogie b : customBogies) {
            System.out.println("  - " + b);
        }
        
        // 3. System applies a Comparator to sort by capacity.
        // Using Comparator.comparingInt() via Lambda/Method Reference
        customBogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        
        // 4. Sorted bogies are displayed in order.
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : customBogies) {
            System.out.println("  - " + b);
        }
        
        System.out.println("=====================================\n");
        
        // ============================================
        // UC8: Filter passenger bogies using Stream pipelines
        // ============================================
        System.out.println("=== UC8: Bogie Filtering (Stream API) ===");
        
        // 1. Create a stream from the list using stream()
        // 2. Apply filter(b -> b.getCapacity() > 60) as the condition
        // 3. Collect the result into a new list
        System.out.println("Filtering bogies with capacity > 60...");
        List<Bogie> highCapacityBogies = customBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(java.util.stream.Collectors.toList());
        
        // 4. Display the filtered bogies
        System.out.println("High Capacity Bogies:");
        for (Bogie b : highCapacityBogies) {
            System.out.println("  - " + b);
        }
        
        System.out.println("=====================================\n");
        
        // ============================================
        // UC9: Group bogies into categories using Stream collectors
        // ============================================
        System.out.println("=== UC9: Grouping Bogies (Collectors.groupingBy) ===");
        
        // Let's add a duplicate category to naturally demonstrate grouping
        customBogies.add(new Bogie("Sleeper", 72));
        
        // 1. Create a stream using stream()
        // 2. Apply Collectors.groupingBy() with a classification function (getName)
        // 3. Store the result in Map<String, List<Bogie>>
        System.out.println("Grouping bogies by category name...");
        Map<String, List<Bogie>> groupedBogies = customBogies.stream()
                .collect(java.util.stream.Collectors.groupingBy(Bogie::getName));
                
        // 4. Print the grouped bogie structure
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nCategory: [" + entry.getKey() + "]");
            for (Bogie b : entry.getValue()) {
                System.out.println("  -> " + b);
            }
        }
        
        System.out.println("=====================================\n");
        
        // ============================================
        // UC10: Aggregate seating capacities into a single total value
        // ============================================
        System.out.println("=== UC10: Total Capacity Aggregation (Stream Reduce) ===");
        
        // 1. Create a stream using stream()
        // 2. Apply map() to extract numeric capacity values.
        // 3. Use reduce() to calculate the total natively.
        System.out.println("Calculating total seating capacity across the consist...");
        int totalCapacity = customBogies.stream()
                .map(Bogie::getCapacity) // Extracting integer payloads
                .reduce(0, Integer::sum); // Aggregating using Method Reference
                
        // 4. Display the total seating capacity
        System.out.println("Total Assessed Seating Capacity: " + totalCapacity + " seats");
        System.out.println("=====================================\n");
        
        // ============================================
        // UC11: Validate Train ID and Cargo Code formats
        // ============================================
        System.out.println("=== UC11: Regex Validation ===");
        
        // 1. Define a regex pattern for Train ID (TRN-\d{4})
        // 3. Compile patterns using the Pattern class
        java.util.regex.Pattern trainIdPattern = java.util.regex.Pattern.compile("TRN-\\d{4}");
        
        // 2. Define a regex pattern for Cargo Code (PET-[A-Z]{2})
        java.util.regex.Pattern cargoCodePattern = java.util.regex.Pattern.compile("PET-[A-Z]{2}");
        
        // Simulate User input
        String validTrainId = "TRN-1234";
        String invalidTrainId = "TRN-12A4";
        String validCargoCode = "PET-AB";
        String invalidCargoCode = "PET-12";
        
        System.out.println("Validating Train IDs (Format: TRN-####):");
        
        // 4. Create Matcher objects for user input
        // 5. Use matches() to validate input formats
        // 6. Display whether the input is valid or invalid
        java.util.regex.Matcher trainMatcher1 = trainIdPattern.matcher(validTrainId);
        System.out.println("  " + validTrainId + " -> Valid: " + trainMatcher1.matches());
        
        java.util.regex.Matcher trainMatcher2 = trainIdPattern.matcher(invalidTrainId);
        System.out.println("  " + invalidTrainId + " -> Valid: " + trainMatcher2.matches());
        
        System.out.println("\nValidating Cargo Codes (Format: PET-XX):");
        
        java.util.regex.Matcher cargoMatcher1 = cargoCodePattern.matcher(validCargoCode);
        System.out.println("  " + validCargoCode + " -> Valid: " + cargoMatcher1.matches());
        
        java.util.regex.Matcher cargoMatcher2 = cargoCodePattern.matcher(invalidCargoCode);
        System.out.println("  " + invalidCargoCode + " -> Valid: " + cargoMatcher2.matches());
        
        System.out.println("=====================================");
    }
}
