package app;

import model.ACCoach;
import model.Coach;
import model.GeneralCoach;
import model.SleeperCoach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        System.out.println("=====================================");
    }
}
