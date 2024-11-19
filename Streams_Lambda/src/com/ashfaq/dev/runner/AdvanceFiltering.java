package com.ashfaq.dev.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ashfaq.dev.utils.ListData;

public class AdvanceFiltering {

	public static void main(String[] args) {

		List<Integer> idsList = new ArrayList<>();
		idsList.add(1);
		idsList.add(2);
		idsList.add(3);
		idsList.add(4);
		idsList.add(5);
		idsList.add(6);
		idsList.add(null);

		List<String> lastnamesList = new ArrayList<>();
		lastnamesList.add("kumar");
		lastnamesList.add("khan");
		lastnamesList.add("JR");
		lastnamesList.add("white");
		lastnamesList.add("Ronaldo");
		lastnamesList.add("Doe");
		lastnamesList.add("Smith");
		lastnamesList.add("Johnson");
		lastnamesList.add("Lee");
		lastnamesList.add("Martin");

		List<String> schoolnamesList = new ArrayList<>();
		schoolnamesList.add("SchoolA");
		schoolnamesList.add("SchoolB");
		schoolnamesList.add("SchoolC");
		schoolnamesList.add("High School A");
		schoolnamesList.add("High School B");
		schoolnamesList.add("SchoolF");
		schoolnamesList.add("SchoolJ");

//		1. filtering based on multiple single data criteria
		ListData.listLoader().stream().filter(Objects::nonNull) // NULL FILTERING
				.filter(user -> user.getSchoolName().equals("SchoolA"))
				.filter(user -> user.getlName().contains("kumar")).forEach(System.out::println);

//		op User [id=3, fName=Monu, lName=kumar, schoolName=SchoolA]

		System.out.println("---------------------------------");

//		1. filtering based on multiple  criteria with multiple data
		ListData.listLoader().stream().filter(Objects::nonNull) // NULL FILTERING
				.filter(user -> idsList.contains(user.getId()))
				.filter(user -> schoolnamesList.contains(user.getSchoolName()))
				.filter(user -> lastnamesList.contains(user.getlName())).forEach(System.out::println);

//		op 

		/**
		 * 
		 * User [id=1, fName=christiano, lName=Ronaldo, schoolName=SchoolA] User [id=2,
		 * fName=Sonu, lName=kumar, schoolName=SchoolB] User [id=3, fName=Monu,
		 * lName=kumar, schoolName=SchoolA] User [id=4, fName=Monty, lName=khan,
		 * schoolName=SchoolC] User [id=5, fName=Chintu, lName=kumar,
		 * schoolName=SchoolB] User [id=6, fName=Jony, lName=JR, schoolName=SchoolA]
		 * User [id=1, fName=John, lName=Doe, schoolName=High School A] User [id=2,
		 * fName=Jane, lName=Smith, schoolName=High School B] User [id=3, fName=Bob,
		 * lName=Johnson, schoolName=High School A]
		 * 
		 */

	}

}
