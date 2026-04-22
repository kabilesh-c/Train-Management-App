package app;

import model.ACCoach;
import model.Coach;
import model.GeneralCoach;
import model.SleeperCoach;

import java.util.ArrayList;
import java.util.List;

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
        
        System.out.println("=====================================");
    }
}
