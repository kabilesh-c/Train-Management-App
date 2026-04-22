# Train Consist Management App

## Overview
This system simulates real-world railway operations by managing train coach composition (consist).

The goal is NOT just coding, but demonstrating:
- Practical use of data structures
- Real-world system design thinking
- Clean, maintainable architecture

Each Use Case (UC) must introduce ONE concept clearly.

## Use Case 1 (UC1)

### Goal
Initialize the Train Consist Management App and display the initial state of the train using basic OOP models.

### Problem Before UC1
No foundational architecture existed to natively represent dynamic trains in memory. Without models, representing varied coaches (Sleeper, AC, General) using basic arrays or unrelated variables scaling and organizing real-world data effectively was impossible.

### Solution
Introduced a Core Java OOP model using a base Coach class, executing from TrainApp as the main entry point to initialize a dynamic list (ArrayList) that efficiently tracks coach additions.

### Concepts Used
- **Class / Main Method:** Entry point, static execution, application structuring.
- **OOP (Abstraction, Inheritance, Polymorphism):** Abstract Coach behaviors delegated securely to SleeperCoach, GeneralCoach, ACCoach.
- **Dynamic Collections (ArrayList):** Growing collections size safely at runtime securely implementing the List abstraction interface natively.
- **Console Output:** System printing statements for interaction.

### Design Explanation
A Coach abstract class groups base requirements (like coachNumber and type). Classes like ACCoach, GeneralCoach, and SleeperCoach inherit properties while holding unique specifications (e.g. tier levels or berthCapacity). The ArrayList provides robust collection logic minimizing boilerplate sizing needed for varying train lengths allowing clean separation of concerns within TrainApp.

## Use Case 2 (UC2)

### Goal
Allow dynamic insertion and removal of passenger bogies using ArrayList natively.

### Problem Before UC2
Fixed-size structures (like standard arrays) cannot dynamically grow or shrink when bogies are attached or detached in real-world scenarios without manually shifting elements, which is heavily error-prone.

### Solution
Introduced basic CRUD operations (Create, Read, Update, Delete) dynamically scaling elements natively using an \ArrayList<String>\. Operations add, remove, and verify bogie presence seamlessly.

### Concepts Used
- **ArrayList:** A resizable collection simulating train expansion effectively.
- **add():** Safely appends an element at the end of the collection maintaining chronological insertion order.
- **remove():** Targets and dynamically deletes specific bogies, scaling down the structure gracefully.
- **contains():** Traverses elements to Boolean-verify whether specific bogie assignments already exist within the active composition.
- **CRUD Operations:** Represents core manipulation basics governing dynamic data behavior natively.

### Design Explanation
Using an \ArrayList<String>\ locally models fundamental memory management without needing larger data domains first. List methods effectively encapsulate all the underlying shift logic needed when adding multiple items "Sleeper, AC Chair" or handling decoupling via remove, keeping operations reliable and clean.

## Use Case 3 (UC3)

### Goal
Ensure no duplicate bogie IDs are added to the train using HashSet.

### Problem Before UC3
When adding bogies using lists or basic arrays, duplicate ID registrations could occur, leading to data corruption and logical errors (e.g., dispatching or tracking the same train bogie twice) because those structures don't natively enforce uniqueness constraints without manual iterative verification.

### Solution
Introduced the \Set\ interface implemented locally via a \HashSet<String>\. Attempts to insert duplicate string identifiers successfully default silently (the duplicates are ignored inherently by the underlying hash map checking identity parity), preventing logical duplicates at runtime.

### Concepts Used
- **HashSet:** An implementation of \Set\ using hashing algorithms for fast indexing and lookup.
- **Set Interface:** Collections that prohibit duplicate elements entirely.
- **add() Method:** Evaluates uniqueness contextually and skips additions if the data identifier previously exists in the target collection.
- **Automatic Deduplication:** Relies securely on internal hash mechanics natively abstracting manual iteration verification.
- **Unordered Storage:** Does not preserve chronological insertion order; items rely directly on index-free hashing locations.

### Design Explanation
Using a \HashSet<String>\ for managing unique bogie IDs natively guarantees rapid O(1) average-time complexity on lookups and additions. Because the real-world domain demands each train coach securely maintains an independent unique identifier ("S-01", "A-02"), \HashSet\ organically shields data integrity cleanly without needing bloated if/else conditional iteration wrappers.

## Use Case 4 (UC4)

### Goal
Model the physical chaining of real-world trains allowing fast insertions and removals at the beginning, end, and middle of the consist natively using a \LinkedList\.

### Problem Before UC4
While \ArrayList\ represents a dynamically growing list, inserting or removing elements from arbitrary positions (like the beginning or middle) requires shifting all subsequent elements in memory. This represents a huge performance bottleneck for large train compositions.

### Solution
Introduced \LinkedList<String>\ for managing train coaches. Because elements are represented as connected node references rather than indexed memory arrays, operations like decoupling the Engine (head) or the Guard coach (tail), and even inserting a Pantry Car mid-train, are executed in constant or linear relational time without shifting allocations.

### Concepts Used
- **LinkedList:** A doubly-linked list collection connecting elements via node references.
- **Node Structure:** Implicitly stores data and directional pointers avoiding fixed indexing limitations.
- **addFirst() / addLast() & removeFirst() / removeLast():** Clean built-in O(1) methods to attach or detach bogies safely from the sequence extremities natively.
- **add(index, element):** Allows targeted mid-consist attachments natively.
- **Order Preservation:** Retains chronological/physical sequencing natively while enabling superior mid-list mutability compared to ArrayList.

### Design Explanation
Using \LinkedList\ naturally maps to how a real train operates structurally—each bogie (node) connects directly to the one in front and behind it. This ensures fast linkage operations natively when coupling/decoupling bogies at ends or unhooking specific coaches mid-journey without needing entire array block recalibrations natively.
