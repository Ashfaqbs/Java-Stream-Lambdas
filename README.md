# Java-Stream-Lambdas

## IntStream Operations

- IntStream is a specialized stream for handling sequences of primitive `int` values. Below are some common operations you can perform with IntStream:

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
