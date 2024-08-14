package com.ashfaq.dev.runner;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        String result = names.stream()
                             .collect(Collectors.joining());
        System.out.println(result);  // Output: AliceBobCharlie
        
        
        String result2 = names.stream()
                .collect(Collectors.joining(", "));
System.out.println(result2);  // Output: Alice, Bob, Charlie



String result3 = names.stream()
.collect(Collectors.joining(", ", "[", "]"));
System.out.println(result3);  // Output: [Alice, Bob, Charlie]
    }
}

/*


Basic Joining: Joins stream elements into a single string.
Delimiter: Adds a delimiter between elements.
Prefix/Suffix: Adds a prefix at the start and a suffix at the end.
Object Joining: Use map() to extract fields and then join.
Custom Collectors: Customize how the joining is done with your logic.


*/