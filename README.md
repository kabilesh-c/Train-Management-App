# ?? Train Consist Management App

## ?? Overview
This system simulates real-world railway operations by managing train coach composition (consist).

The goal is NOT just coding, but demonstrating:
- Practical use of data structures
- Real-world system design thinking
- Clean, maintainable architecture

Each Use Case (UC) must introduce ONE concept clearly.

## ?? Use Case 1 (UC1)

### ?? Goal
Initialize the Train Consist Management App and display the initial state of the train using basic OOP models.

### ? Problem Before UC1
No foundational architecture existed to natively represent dynamic trains in memory. Without models, representing varied coaches (Sleeper, AC, General) using basic arrays or unrelated variables scaling and organizing real-world data effectively was impossible.

### ?? Solution
Introduced a Core Java OOP model using a base Coach class, executing from TrainApp as the main entry point to initialize a dynamic list (ArrayList) that efficiently tracks coach additions.

### ?? Concepts Used
- **Class / Main Method:** Entry point, static execution, application structuring.
- **OOP (Abstraction, Inheritance, Polymorphism):** Abstract Coach behaviors delegated securely to SleeperCoach, GeneralCoach, ACCoach.
- **Dynamic Collections (ArrayList<Coach>):** Growing collections size safely at runtime securely implementing the List abstraction interface natively.
- **Console Output:** System printing statements for interaction.

### ?? Design Explanation
A Coach abstract class groups base requirements (like coachNumber and 	ype). Classes like ACCoach, GeneralCoach, and SleeperCoach inherit properties while holding unique specifications (e.g. 	ier levels or erthCapacity). The ArrayList provides robust collection logic minimizing boilerplate sizing needed for varying train lengths allowing clean separation of concerns within TrainApp.
