# SDP_Assignment5

**Name:** Assanbayev Yelaman  
**Group:** SE-2538  
**Topic:** B (Calculator)  

Strategy pattern demo: the user picks an operation (add, subtract, multiply, divide) at runtime. Each operation is a separate class behind one interface.

## Pattern roles

- **Strategy Interface:** `OperationStrategy`
- **Concrete Strategies:** `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy`
- **Context:** `Calculator`
- **Client:** `Main`

## Build & Run

1. Open the project in IntelliJ IDEA.
2. Run `Main` from the run configuration.

## Add a new strategy

1. Create a class that implements `OperationStrategy`.
2. Add it to the menu list in `Main`: new ExampleStrategy().
