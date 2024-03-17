package com.ashfaq.dev.runner;

import java.util.function.Function;
import java.util.function.Supplier;

class User {
	private String name;

	public User() {
		// Default constructor
	}

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}

public class ConstructorReferences {

	public static void main(String[] args) {

//		Using Lambda Expression Without constructor reference:
		Supplier<User> userSupplier = () -> new User();
		User user = userSupplier.get();
		System.out.println(user.toString());

//		Using Constructor Reference With constructor reference:

		Supplier<User> userSupplier1 = User::new;
		User user1 = userSupplier1.get();

		System.out.println(user1.toString());

//		Both of these examples create a Supplier of User objects, which can supply new User instances upon calling get().
//		The constructor reference User::new is essentially a shorthand for () -> new User().

//		Example with Parameterized Constructor If User has a constructor that takes a String name, you can use a function interface to reference it:

		Function<String, User> userFunction = User::new;
		User user3 = userFunction.apply("Ashfaq");

		System.out.println(user3.toString());

//		Here, Function<String, User> represents a function that takes a String and
//		returns a User. The User::new reference points to the User constructor that takes a String parameter.

//		User user5 = User::new; this will throw error syntax is not correct
	}
}
