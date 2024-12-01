When working with Java **streams**, the collected data can be stored in either **mutable** or **immutable** data structures. Here's how we can achieve both:

### LIST 
---

## **1. Mutable Data Structures**
Mutable collections allow changes after creation, like adding, removing, or updating elements. 

### Example: Collecting into a `List`
```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MutableExample {
    public static void main(String[] args) {
        List<String> mutableList = Stream.of("apple", "banana", "orange")
                                         .collect(Collectors.toList());
        mutableList.add("grape"); // Adding an element is allowed

        System.out.println("Mutable List: " + mutableList);
    }
}
```

### Output:
```
Mutable List: [apple, banana, orange, grape]
```

---

## **2. Immutable Data Structures**
Immutable collections cannot be modified after creation.

### Using `Collectors.toUnmodifiableList()` (Java 10+)
```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList = Stream.of("apple", "banana", "orange")
                                           .collect(Collectors.toUnmodifiableList());

        // immutableList.add("grape"); // This will throw UnsupportedOperationException

        System.out.println("Immutable List: " + immutableList);
    }
}
```

### Output:
```
Immutable List: [apple, banana, orange]
```

---

### Other Immutable Collectors
- **`Collectors.toUnmodifiableSet()`**: Creates an immutable `Set`.
- **`Collectors.toUnmodifiableMap()`**: Creates an immutable `Map`.

---

## **3. Comparison Between Mutable and Immutable**

| Feature                   | Mutable                       | Immutable                     |
|---------------------------|-------------------------------|-------------------------------|
| Modifications Allowed?    | Yes                          | No                            |
| Common Use Cases          | Temporary data manipulation  | Final or thread-safe data     |
| Example Collector Method  | `Collectors.toList()`         | `Collectors.toUnmodifiableList()` |

---

## **4. Custom Collector for Mutable Collection**
For example, collecting data into a **custom mutable structure** like `LinkedList`:

```java
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomMutableExample {
    public static void main(String[] args) {
        List<String> linkedList = Stream.of("apple", "banana", "orange")
                                        .collect(Collectors.toCollection(LinkedList::new));

        linkedList.add("grape"); // Adding an element is allowed
        System.out.println("Custom Mutable LinkedList: " + linkedList);
    }
}
```

---

## **5. Using Streams with Immutable Data Structures**

### Using `Collectors.collectingAndThen()`
To create immutable versions of collections, we can wrap a mutable collection in an immutable wrapper:

```java
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableWithCollectingAndThen {
    public static void main(String[] args) {
        List<String> immutableList = Stream.of("apple", "banana", "orange")
                                           .collect(Collectors.collectingAndThen(
                                               Collectors.toList(), 
                                               Collections::unmodifiableList
                                           ));

        // immutableList.add("grape"); // This will throw UnsupportedOperationException
        System.out.println("Immutable List with CollectingAndThen: " + immutableList);
    }
}
```

---

## Summary of Collectors
### Mutable:
1. `Collectors.toList()` → Returns a mutable `List`.
2. `Collectors.toSet()` → Returns a mutable `Set`.
3. `Collectors.toMap()` → Returns a mutable `Map`.

### Immutable:
1. `Collectors.toUnmodifiableList()`
2. `Collectors.toUnmodifiableSet()`
3. `Collectors.toUnmodifiableMap()`
4. `Collectors.collectingAndThen(..., Collections::unmodifiableXXX)`.

---


### MAP

Here’s how we can collect data into mutable and immutable **Map** structures using Java Streams.

---

## **1. Collecting into a Mutable Map**

### Example: Using `Collectors.toMap()`
```java
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MutableMapExample {
    public static void main(String[] args) {
        Map<String, Integer> mutableMap = Stream.of(
                new String[]{"apple", "1"},
                new String[]{"banana", "2"},
                new String[]{"orange", "3"}
        ).collect(Collectors.toMap(
                data -> data[0],  // Key mapper (e.g., fruit name)
                data -> Integer.parseInt(data[1]) // Value mapper (e.g., fruit count)
        ));

        // Modifications are allowed
        mutableMap.put("grape", 4);
        System.out.println("Mutable Map: " + mutableMap);
    }
}
```

### Output:
```
Mutable Map: {apple=1, banana=2, orange=3, grape=4}
```

---

## **2. Collecting into an Immutable Map**

### Example: Using `Collectors.toUnmodifiableMap()`
```java
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map<String, Integer> immutableMap = Stream.of(
                new String[]{"apple", "1"},
                new String[]{"banana", "2"},
                new String[]{"orange", "3"}
        ).collect(Collectors.toUnmodifiableMap(
                data -> data[0],  // Key mapper
                data -> Integer.parseInt(data[1]) // Value mapper
        ));

        // immutableMap.put("grape", 4); // This will throw UnsupportedOperationException
        System.out.println("Immutable Map: " + immutableMap);
    }
}
```

### Output:
```
Immutable Map: {apple=1, banana=2, orange=3}
```

---

## **3. Resolving Key Conflicts**

When keys are duplicated in the stream, you'll need to define a merge function.

### Example: Handling Duplicate Keys
```java
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeyConflictExample {
    public static void main(String[] args) {
        Map<String, Integer> mapWithMergedValues = Stream.of(
                new String[]{"apple", "1"},
                new String[]{"banana", "2"},
                new String[]{"apple", "3"} // Duplicate key: "apple"
        ).collect(Collectors.toMap(
                data -> data[0], // Key mapper
                data -> Integer.parseInt(data[1]), // Value mapper
                (oldValue, newValue) -> oldValue + newValue // Merge function
        ));

        System.out.println("Map with Merged Values: " + mapWithMergedValues);
    }
}
```

### Output:
```
Map with Merged Values: {apple=4, banana=2}
```

---

## **4. Using `Collectors.collectingAndThen` for Immutable Maps**

If we want to start with a mutable map and then wrap it in an immutable one, use `Collectors.collectingAndThen`.

### Example:
```java
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingAndThenExample {
    public static void main(String[] args) {
        Map<String, Integer> immutableMap = Stream.of(
                new String[]{"apple", "1"},
                new String[]{"banana", "2"},
                new String[]{"orange", "3"}
        ).collect(Collectors.collectingAndThen(
                Collectors.toMap(
                        data -> data[0],  // Key mapper
                        data -> Integer.parseInt(data[1]) // Value mapper
                ),
                Collections::unmodifiableMap // Wrap in unmodifiableMap
        ));

        // immutableMap.put("grape", 4); // Throws UnsupportedOperationException
        System.out.println("Immutable Map using CollectingAndThen: " + immutableMap);
    }
}
```

### Output:
```
Immutable Map using CollectingAndThen: {apple=1, banana=2, orange=3}
```

---

## **Summary**

### **Mutable Maps**
1. **`Collectors.toMap()`**:
   - Can add, remove, or modify entries.
   - Example:
     ```java
     Map<String, Integer> mutableMap = Stream.of(...)
             .collect(Collectors.toMap(...));
     mutableMap.put("newKey", value); // Allowed
     ```

### **Immutable Maps**
1. **`Collectors.toUnmodifiableMap()`**:
   - Creates a Map that cannot be modified.
   - Example:
     ```java
     Map<String, Integer> immutableMap = Stream.of(...)
             .collect(Collectors.toUnmodifiableMap(...));
     ```
2. **`Collectors.collectingAndThen(..., Collections::unmodifiableMap)`**:
   - Wraps a mutable map into an immutable one after creation.


