package com.ashfaq.dev.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Student oneStudent = new Student("Sonu", "Male", 100);
		Student twoStudent = new Student("Tony", "Male", 70);

		Student theeStudent = new Student("Madhumita", "FeMale", 95);

		List<Student> sList = new ArrayList<Student>();
		sList.add(oneStudent);
		sList.add(twoStudent);
		sList.add(theeStudent);
//		 names of students

//	map of Gender List<names>

//		Map<String, List<Student>> collect = sList.stream().collect(Collectors.groupingBy(Student::getGender));
//		
//		
//		collect.forEach((getGender , listNames) ->{
//			System.out.println(getGender +"  "+listNames.stream());
//		});
//		
//		
//		
//		
//		
//		String sampleString= "";
//		String replace = sList.stream().map(Student::getName).
//				toList().
//				toString().replace(" ", "-").replace("[", "").replace("]", "").replace(",", " ");
////				
//		char[] charArray = replace.toCharArray();
//		for(int i =0;i<charArray.length;i++)
//		{
//			sampleString=sampleString+charArray[i];
//			
//		}
//		
//		System.out.println(sampleString);
//
//		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		Integer reduce = asList.stream().reduce(0, (a1, a2) -> a1 + a2);
////		System.out.println(reduce);
//
//		asList.stream().filter(data -> data != 1).forEach(System.out::println);

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		int sum = asList.stream().mapToInt(data -> data).sum();
//		System.out.println(sum);

	}

}
