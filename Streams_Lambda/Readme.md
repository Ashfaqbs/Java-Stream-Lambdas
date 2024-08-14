## Functional Interfaces in Java 8:
### Java 8 introduced several functional interfaces in the java.util.function package, including:

1. Function<T, R>: Takes an input of type T and returns a result of type R.

2. Consumer<T>: Takes an input of type T and returns no result (void).
 
 
 ```
 Consumer<Integer> printNumber = System.out::println;
 List<Integer> numbers = List.of(1, 2, 3, 4, 5);
 numbers.forEach(printNumber);
 ```
3. Supplier<T>: Provides a result of type T without taking any input.

```
Supplier<String> getDefaultString = () -> "Hello, World!";
System.out.println(getDefaultString.get());  // Output: "Hello, World!"
```
4. Predicate<T>: Takes an input of type T and returns a boolean.

```
import java.util.function.Predicate;

Predicate<Integer> isEven = num -> num % 2 == 0;
System.out.println(isEven.test(4));  // Output: true
System.out.println(isEven.test(5));  // Output: false

```
5. UnaryOperator<T>: Takes an input of type T and returns a result of the same type T.
```
import java.util.function.UnaryOperator;

UnaryOperator<Integer> doubleValue = num -> num * 2;
System.out.println(doubleValue.apply(5));  // Output: 10

```

6. BinaryOperator<T>: Takes two inputs of type T and returns a result of the same type T.

```
import java.util.function.BinaryOperator;

BinaryOperator<Integer> addNumbers = (a, b) -> a + b;
System.out.println(addNumbers.apply(5, 3));  // Output: 8

```


### Samples 

```
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


Function<Person, String>

import java.util.function.Function;
import java.util.List;

Function<Person, String> personToName = Person::getName;

List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 25));
people.stream().map(personToName).forEach(System.out::println);  // Output: Alice, Bob


Consumer<Person>


import java.util.function.Consumer;

Consumer<Person> printPerson = System.out::println;
people.forEach(printPerson);
// Output:
// Alice (30)
// Bob (25)


Supplier<Person>

import java.util.function.Supplier;

Supplier<Person> defaultPerson = () -> new Person("Default", 0);
Person person = defaultPerson.get();
System.out.println(person);  // Output: Default (0)


Predicate<Person>

import java.util.function.Predicate;

Predicate<Person> isAdult = p -> p.getAge() > 18;
people.stream().filter(isAdult).forEach(System.out::println);
// Output (both Alice and Bob are older than 18):
// Alice (30)
// Bob (25)


UnaryOperator<Person>

import java.util.function.UnaryOperator;

UnaryOperator<Person> increaseAge = p -> new Person(p.getName(), p.getAge() + 1);
people.stream().map(increaseAge).forEach(System.out::println);
// Output:
// Alice (31)
// Bob (26)


BinaryOperator<Person>

import java.util.function.BinaryOperator;

BinaryOperator<Person> olderPerson = (p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2;
Person older = olderPerson.apply(people.get(0), people.get(1));
System.out.println("Older person: " + older);  // Output: Older person: Alice (30)
```

### Summary:

- Function: Extract or transform properties of an object.

- Consumer: Perform an action on an object without returning anything.

- Supplier: Generate or provide an object.

- Predicate: Test a condition on an object.

- UnaryOperator: Modify the object in-place (returns the same type).

- BinaryOperator: Combine two objects of the same type.