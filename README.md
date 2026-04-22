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

## Use Case 5 (UC5)

### Goal
Maintain insertion order while enforcing uniqueness.

### Problem Before UC5
A regular \HashSet\ enforces uniqueness but scrambling the order of elements natively breaks the physical alignment of a train. A standard \List\ preserves ordering but allows duplicate bogies, creating logical data corruption if a specific bogie ID gets attached repeatedly without rigorous external iterative validations.

### Solution
Introduced \LinkedHashSet<String>\ natively combining the best of both mechanics. By utilizing a hash table wrapped with a linked list, duplicate attempts strictly fail automatically while naturally maintaining the exact chronological sequence natively in memory.

### Concepts Used
- **LinkedHashSet:** A hash table and linked list implementation of the Set interface storing elements predictably natively without indices.
- **Set Interface:** Collections that strictly prohibit duplicate elements natively ensuring no coach is bound more than once seamlessly.
- **add() Method:** Abstracts out loop-based uniqueness validation, automatically discarding identical values safely natively without errors.
- **Automatic Deduplication:** Removes duplicates silently without manual loops natively protecting business integrity rules passively natively.
- **Insertion Order Preservation:** Unlike HashSet, the Linked structure sequentially threads previous and next node links mimicking real train architecture naturally maintaining physical attachment logic natively.
- **Ordered Iteration:** Predictably returns components accurately reflecting initial assembly whenever iterated organically avoiding sorting implementations completely natively.

### Design Explanation
Integrating a \LinkedHashSet\ effectively represents train chaining. A coach ID should objectively never exist twice inside the consist (Set). Also, the engine naturally goes first, followed reliably by the attached subsequent links sequentially tracking the physical chain realistically (Linked). Real-world rules map organically avoiding convoluted boilerplate natively.

## Use Case 6 (UC6)

### Goal
Associate each bogie with its seating or load capacity using a key-value mapping structure.

### Problem Before UC6
Using plain lists or sets only structured the names or identities of the bogies dimensionally. If we needed to reference the capacity of a specific bogie naturally, we would be forced to create complex domain objects too early or maintain risky parallel arrays natively tracking data, making lookups extremely slow and unmaintainable.

### Solution
Introduced a key-value mapping using \HashMap<String, Integer>\. This natively allows the application to directly associate a specific bogie's name (the key) with its specific seating or load capacity (the value). 

### Concepts Used
- **HashMap:** A hash table based implementation of the Map interface that stores data independently as key-value pairs cleanly natively.
- **Map Interface:** A collection type specifically representing a 1-to-1 mapping relationship between unique keys and their corresponding values natively.
- **put() Method:** Inserts or immediately updates a key-value pair within the map seamlessly targeting individual identifiers natively.
- **Key-Value Association:** Models real-world physical property relationships inherently by uniquely binding isolated attributes natively (e.g., binding "Sleeper" permanently to 72 natively).
- **entrySet() Iteration:** Exclusively provides a reliable unified view of the entire map seamlessly, allowing fluid iteration over both keys and values coupled exactly natively.
- **Fast Lookup Using Keys:** Ultimately enables O(1) constant-time retrieval naturally retrieving data instantly targeting the bogie identifier exactly natively.

### Design Explanation
Integrating a \HashMap\ perfectly reflects real-world operational reference tables natively (like a master train manifest natively). Instead of iterating exhaustively through a list manually trying to conditionally define a particular coach's capacity locally natively, the system delegates lookups organically mapped exclusively resolving the stats intrinsically natively structuring robust domains natively seamlessly.

## Use Case 7 (UC7)

### Goal
Sort passenger bogies based on their seating capacity using a custom Comparator.

### Problem Before UC7
Primitives and single-value strings sort alphabetically or numerically by default (Natural Ordering). A "Sleeper" string is naturally separated from its integer capacity unless mapped. But if you have complex data sets containing arrays of names and capacities mapping 1-to-1 loosely, iterating to sort entire train setups by multiple nested fields manually requires exhaustive, messy bubble-sort implementations polluting the business logic.

### Solution
Introduced a clean \Bogie\ Model class aggregating its respective \
ame\ and \capacity\ into single discrete custom objects. By leveraging the \Comparator\ interface externally on lists of \Bogie\ instances natively, the system delegates exact sorting rule processing cleanly avoiding polluted core domains.

### Concepts Used
- **Comparator Interface:** A functional interface utilized externally to inject custom comparison logic, determining exactly how objects order themselves ignoring standard alphabetically restrictive baselines.
- **Custom Objects (\Bogie\):** Groups disjointed bogie data properties internally allowing unified robust operational behavior.
- **List Collection:** Holds arrays of custom \Bogie\ models seamlessly enabling bulk logic applications natively.
- **sort() Method:** Mutates the underlying list restructuring index alignments immediately using provided Lambda heuristics natively.
- **Lambda Expressions / Method References (\Bogie::getCapacity\):** Provides concise logic targeting specific fields minimizing bloated anonymous class implementations organically.
- **Separation of Data and Logic:** Keeps the \Bogie\ layout unaware of how \TrainApp\ decides to sort it ensuring robust maintainable architectures.

### Design Explanation
Using Java's \Comparator.comparingInt()\ cleanly abstracts the low-level swapping logic required to reorganize a train. Instead of writing custom loops to reorganize coaches by size, passing a Comparator acts as a declarative rule telling the collection exactly *what* matters (capacity payload) without dictating specifically *how* memory indexing must swap it natively.

## Use Case 8 (UC8)

### Goal
Filter passenger bogies using Stream pipelines based on seating capacity.

### Problem Before UC8
Filtering objects in a collection traditionally requires writing explicit \or\ loops, instantiating empty temporary lists, and adding boilerplate conditional \if\ statements inside the blocks. This imperative approach natively makes code verbose, harder to read, and difficult to test safely when business rules grow complex dynamically.

### Solution
Introduced the Java Stream API to process collections in a declarative style natively. By converting the \Bogie\ list into a stream, we apply a \ilter()\ operation cleanly utilizing a concise Lambda expression (\ -> b.getCapacity() > 60\) and automatically collect the matching results into a new standalone list natively, completely eliminating explicit manual iteration loops.

### Concepts Used
- **Stream API:** A modern Java feature that processes collections in a declarative style natively, allowing operations such as filtering, mapping, and aggregation instantly without manual looping constructs natively.
- **stream() Method:** Organically converts a collection object natively into a pipelined stream so that functional processing operations can be fluidly applied directly over bogie data.
- **filter() Operation:** Contextually selects targeted elements exclusively satisfying a provided condition safely (e.g., retrieving objects matching capacity > 60).
- **Lambda Expressions:** Functionally provide concise inline behavior definitions for logic processing instead of relying on long conditional loop structures internally.
- **collect() / toList():** Securely converts the functionally processed stream pipeline effectively returning a standalone collection safely that can be reliably stored or displayed gracefully.
- **Declarative Programming Style:** Conceptually focuses on *what* to extract safely instead of *how* exactly to step-by-step iterate and mutate, vastly improving intent clarity organically.

### Design Explanation
Using Stream pipelines shifts the application directly from imperative procedures organically to functional-style programming reliably. Instead of commanding Java precisely how to navigate arrays and compare items systematically natively, the code declares its criteria (\getCapacity() > 60\) declaratively. The Stream natively filters the extraction securely repacking matching items gracefully into cleanly mapped memory without mutating the source dataset implicitly natively.

## Use Case 9 (UC9)

### Goal
Group bogies into categories using Stream collectors natively for analytical structure.

### Problem Before UC9
Separating flat collections into organized subsets by type historically required initializing empty maps, manually iterating across all entities, conditionally checking if the category key existed, and creating sub-lists before appending objects natively. This error-prone setup logic completely obscures the primary business intent behind thick loops.

### Solution
Utilized \Collectors.groupingBy()\ natively embedded within the Stream API logic. By mapping the classification condition (\Bogie::getName\), Java automatically initializes the structural mapping and seamlessly sorts every bogie entity into hierarchical \Map<String, List<Bogie>>\ categorizations elegantly. 

### Concepts Used
- **Collectors.groupingBy():** A functional stream collector aggregating and sorting matching instances into distinct mapping endpoints dynamically relying strictly on declarative conditions natively.
- **Stream Pipeline:** Applies sequential data processing sequentially handling transformations safely without rewriting raw states.
- **Map Output Structure:** Successfully produces aggregated mapping (\Map\) representing group identities linking sub-collections mapping identical entities together natively.
- **Lambda Classification Logic:** Defines cleanly how bogies categorize (grouping directly by the Bogie Name seamlessly).
- **Data Aggregation:** Collates dispersed flat lists intuitively capturing identical references correctly into unified analytical clusters natively.
- **Structured Transformation:** Generates hierarchical formatting naturally reflecting operational organization logic cleanly.

### Design Explanation
Calling \Collectors.groupingBy()\ transitions processing naturally from flat linear structures to hierarchical categorization safely. Because a consist often needs rapid grouping by coach classification (how many 'Sleepers'? how many 'AC Chairs'?), this collector fundamentally delegates the organizational logic explicitly cleanly returning precise grouping natively skipping nested looping artifacts natively.

## Use Case 10 (UC10)

### Goal
Aggregate seating capacities into a single total value using Stream reduction natively for reporting metrics.

### Problem Before UC10
Adding numeric properties across a grouping of Objects usually dictates instantiating an external integer variable initialized at 0, paired with an enhanced \or\ array loop iterating sequentially and incrementing the property individually per element (+ \ogie.getCapacity()\). This manually tracked mutation process is verbose, error-prone on larger enterprise systems, and obstructs logic reading conceptually.

### Solution
Tapped into the Java functional Streams interface natively deploying the \.map()\ operation to effortlessly extract capacities combined with the \.reduce()\ mathematical function effectively computing the aggregate total gracefully utilizing \Integer::sum\.

### Concepts Used
- **map() Operation:** Structurally transforms every mapped \Bogie\ object converting them fluidly into an isolated stream of numeric \capacity\ integers exclusively representing the target metrics natively.
- **reduce() Method:** Synthesizes/Combines scattered sequential values organically producing one single terminal aggregation result (summing cumulative seating thresholds collectively together natively into one digit).
- **Method Reference:** Applies concise stylistic syntax invoking existing logic efficiently natively (\Integer::sum\) eliminating excessive Lambda closures declaratively. 
- **Functional Aggregation:** Formats mathematical computation dynamically resolving loops manually into expressive operational pipeline instructions transparently.
- **Stream Pipeline:** Bridges discrete processing actions seamlessly forming fluid pipelines extracting data properly and applying accumulation instantaneously.
- **Numeric Analytics:** Empowers organizational capabilities delivering quantitative load capacities calculating operational thresholds passively improving metrics visibility meaningfully.

### Design Explanation
Using \map(Bogie::getCapacity)\ organically decouples object structures abstracting purely the analytical dataset required cleanly natively. Afterwards, \educe(0, Integer::sum)\ provides robust terminal mathematics summing properties smoothly ensuring that capacity calculation rules stay encapsulated inside rapid operational pipelines completely independent from external loop mutations cleanly.

## Use Case 11 (UC11)

### Goal
Validate Train ID and Cargo Code formats using Regular Expressions proactively ensuring data integrity.

### Problem Before UC11
Checking complex string combinations like "TRN-1234" manually requires verbose, deeply nested loop configurations that verify character alignments index-by-index using static \Character.isDigit()\ checks natively. This procedural strategy is deeply error-prone, fragile to formatting updates, and extremely exhausting to maintain effectively within the core operational domains natively.

### Solution
Introduced Java's explicit Regular Expression classes (\Pattern\ & \Matcher\). By precisely defining explicit formatting constraints natively ("TRN-\d{4}" & "PET-[A-Z]{2}"), the application immediately parses complicated combinations natively rejecting misaligned syntax instantaneously without executing explicit loops intuitively.

### Concepts Used
- **Regular Expressions (Regex):** A pattern recognition language embedded formally describing structurally valid textual criteria natively (e.g. TRN-1234 natively).
- **Pattern Class:** Represents the compiled structure validating standard regex algorithms efficiently, natively reused verifying widespread entity collections natively.
- **Matcher Class:** Systematically overlays the parsed \Pattern\ natively comparing strict data formatting intrinsically.
- **matches() Method:** Computes strict Boolean feedback validating whether targeted strings perfectly conform encapsulating entire boundaries without trailing data natively. 
- **Format Enforcement:** Strict enterprise application logic gatekeeping incorrect formatting configurations structurally preventing bad database persistence synchronously.
- **Data Integrity Validation:** Protects downstream logic natively halting pipeline execution smoothly discarding incorrectly typed configurations cleanly.

### Design Explanation
Relying directly on \Pattern\ and \Matcher\ inherently solves input corruption accurately. Instead of trusting untyped literal string variables passing seamlessly downstream blindly mimicking operational logic, enforcing regex structures verifies precise semantic meaning (\TRN-\ followed strictly by 4 exact digits natively). This explicitly rejects instances like "TRN-12A4" instantly, structurally fortifying overall execution layers consistently without messy looping mechanisms intuitively.

## Use Case 12 (UC12)

### Goal
Encapsulate bogie rules using functional interfaces and apply them using lambda expressions natively via Stream validation.

### Problem Before UC12
Validating multiple objects against complex conditional safety rules conventionally requires manually iterating across arrays. Inside the loop, developers orchestrate messy, nested Boolean condition branches. When a failure is found, manual \reak\ commands must be triggered explicitly, or external boolean flags (\isSafe = false\) must be manually mutated. This logic is difficult to read and scales poorly across numerous growing validation layers natively.

### Solution
Implemented Java Streams specifically utilizing the \.allMatch()\ terminal operator conditionally wrapping logical constraints seamlessly inside Lambda Expressions natively. By defining the rule functionally (e.g., verifying a \Cylindrical\ type strictly carries true \Petroleum\ natively), the Stream evaluates safety metrics abstractly, providing declarative, secure business validation cleanly natively.

### Concepts Used
- **Streams API:** Empowers seamless declarative collection processing natively transforming rule evaluation data safely completely stripping out repetitive boilerplate iterations.
- **allMatch() Terminal Operation:** Evaluates the aggregate stream against a singular explicit \Predicate\ natively, returning true exclusively if every unified element strictly satisfies the constraint securely.
- **Lambda Expressions:** Translates complex verification rules directly into readable inline conditions avoiding clunky anonymous class definitions natively holding logic operations.
- **Conditional Logic in Streams:** Directly couples mathematical operators (+ Boolean Logic) safely isolating filtering constraints intrinsically.
- **Short-Circuit Evaluation:** Aborts the evaluation actively and immediately upon checking the first mismatched failure natively, without exhaustively completing unnecessary downstream processing sequentially saving runtime costs safely.
- **Business Rule Modeling:** Encapsulates explicit functional behaviors preventing physical hazards dynamically mimicking logic structures inherently seamlessly.

### Design Explanation
Integrating \llMatch\ structures isolated safety gates that actively return \	rue\ internally protecting validation payloads cleanly seamlessly. Rather than exhaustively relying on imperative nested conditionals flagging arrays natively, this explicit mechanism filters the stream abstractly instantly. Evaluated alongside the newly established \GoodsBogie\, it efficiently flags the invalid "Water-in-Cylinder" instance seamlessly defaulting to a restrictive \alse\ reliably natively securing train configurations.
