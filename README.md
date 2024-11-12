# Java-Stream-Lambdas

## A **Functional Interface** in Java 8 is an interface that has exactly **one abstract method**. It can have multiple default or static methods, but it must have exactly one abstract method, which makes it eligible to be used with **lambda expressions** and **method references**.

### Breakdown of Functional Interfaces:

- **Single Abstract Method (SAM)**: The key characteristic of a functional interface is that it only contains **one abstract method**. This is the "contract" that a lambda expression or a method reference will implement.
  
- **`@FunctionalInterface` Annotation** (optional but recommended): This annotation is used to indicate that the interface is intended to be a functional interface. It’s not required, but it helps catch errors at compile time if the interface does not conform to the rules of a functional interface (i.e., having more than one abstract method).
  
  Example:
  ```java
  @FunctionalInterface
  public interface MyFunction {
      void execute();  // Single abstract method
  }
  ```

### Examples of Built-in Java 8 Functional Interfaces:

1. **Runnable**:
   - The `Runnable` interface has a single abstract method, `run()`.
   - It can be used in a lambda expression as follows:
     ```java
     Runnable myRunnable = () -> System.out.println("Running in a thread!");
     ```

2. **Predicate**:
   - `Predicate<T>` represents a boolean-valued function of one argument. Its abstract method is `boolean test(T t)`.
   - Example of using `Predicate` with a lambda:
     ```java
     Predicate<String> isEmpty = str -> str.isEmpty();
     System.out.println(isEmpty.test(""));  // true
     ```

3. **Function**:
   - `Function<T, R>` is a function that accepts one argument of type T and returns a result of type R. Its abstract method is `R apply(T t)`.
   - Example of using `Function` with a lambda:
     ```java
     Function<Integer, String> convertToString = num -> "Number " + num;
     System.out.println(convertToString.apply(5));  // Output: Number 5
     ```

4. **Consumer**:
   - `Consumer<T>` represents an operation that accepts a single input argument and returns no result. Its abstract method is `void accept(T t)`.
   - Example:
     ```java
     Consumer<String> printMessage = message -> System.out.println(message);
     printMessage.accept("Hello, World!");  // Output: Hello, World!
     ```

5. **Supplier**:
   - `Supplier<T>` represents a function that takes no arguments and returns a value of type T. Its abstract method is `T get()`.
   - Example:
     ```java
     Supplier<Double> randomValue = () -> Math.random();
     System.out.println(randomValue.get());  // Output: Some random value between 0 and 1
     ```

### Key Points:
- **Functional interfaces** are meant to represent a single unit of work that can be expressed in a concise form via lambda expressions.
- The **`@FunctionalInterface` annotation** ensures the interface has exactly one abstract method (but doesn't force it).
- They can be used wherever a lambda expression or method reference is required.

### Why are Functional Interfaces important in Java 8?
They are central to **functional programming** in Java, especially with features like **Streams**, **lambda expressions**, and **method references**. By using functional interfaces, we can pass behavior around as data, enabling more concise and expressive code.

---

### Why Do We Use Functional Interfaces?

These functional interfaces let us write cleaner, more modular code. Instead of writing whole classes for one task, we can just use a lambda expression with these functional interfaces. This makes Java more like a "do it in one line" kind of language, which is faster and looks cleaner.

So, in short:
- Functional interfaces make it easy to pass actions as parameters.
- They work great with lambdas to make code simpler and cleaner.





## IntStream Operations

- IntStream is a specialized stream for handling sequences of primitive `int` values. Below are some common operations we can perform with IntStream:

### Creating an IntStream

```
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        
        // Print all elements
        intStream.forEach(System.out::println);



 int sum = IntStream.of(1, 2, 3, 4, 5)
                           .sum();
        System.out.println("Sum: " + sum);


 double average = IntStream.of(1, 2, 3, 4, 5)
                                  .average()
                                  .orElse(0.0);
        System.out.println("Average: " + average);



   IntStream stream = IntStream.of(1, 2, 3, 4, 5);

        int max = stream.max().orElseThrow();
        int min = IntStream.of(1, 2, 3, 4, 5).min().orElseThrow();
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


  int sum = IntStream.of(1, 2, 3, 4, 5)
                           .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);


    }
}





```
## Stream<String> Operations


### Stream<String> handles sequences of String values and provides various operations for transformation and aggregation.
- Creating a String Stream



```
public class StringStreamExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("apple", "banana", "cherry");
        
        // Print all elements
        stringStream.forEach(System.out::println);


 List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
        String result = fruits.stream()
                              .collect(Collectors.joining(", "));
        System.out.println("Joined: " + result);

  List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
        List<String> uppercaseFruits = fruits.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        System.out.println("Uppercase: " + uppercaseFruits);





List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
        List<String> longFruits = fruits.stream()
                                        .filter(fruit -> fruit.length() > 5)
                                        .collect(Collectors.toList());
        System.out.println("Long Fruits: " + longFruits);





List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
        long count = fruits.stream().count();
        System.out.println("Count: " + count);



 List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
        Optional<String> firstFruit = fruits.stream().findFirst();
        System.out.println("First: " + firstFruit.orElse("None"));


 List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("apple", "banana"),
            Arrays.asList("cherry", "date")
        );
        
        List<String> flatList = listOfLists.stream()
                                           .flatMap(List::stream)
                                           .collect(Collectors.toList());
        System.out.println("Flat List: " + flatList);




    }
}






```
