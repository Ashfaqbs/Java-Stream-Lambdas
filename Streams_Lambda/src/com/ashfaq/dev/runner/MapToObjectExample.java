package com.ashfaq.dev.runner;

import java.util.List;
import java.util.stream.Collectors;

public class MapToObjectExample {
    public static void main(String[] args) {
        String input = "hello";

        // Using mapToObj to convert each character to a Character object
        List<Character> characters = input.chars()
            .mapToObj(c -> (char) c)  // Convert int to Character
            .collect(Collectors.toList());  // Collect into a list

        System.out.println("Characters in the list: " + characters);
    }
}


//OP : Characters in the list: [h, e, l, l, o]
