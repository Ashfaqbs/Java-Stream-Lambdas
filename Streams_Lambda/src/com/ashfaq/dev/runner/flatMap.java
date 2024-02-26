package com.ashfaq.dev.runner;

import java.util.stream.Stream;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class flatMap {

//	The flatMap() operation first applies a mapping 
//	function to each element of the stream, which results in a stream of streams.
//	It then flattens these streams into a single stream of elements.
//	Use flatMap() when you want to deal with nested streams or when 
//	the mapping function returns a stream.

	public static void main(String[] args) {

//		flatMap() is typically used when you have a stream of collections or streams and you want to flatten them 
//		into a single stream. In this case, you have a stream of User objects 
//		]and you want to extract a single attribute (fName) from each object, which doesn't require flattening.
		ListData.listLoader().stream().map(User::getfName) // Transform each User object into its first name
				.flatMap(Stream::of) // Flatten the stream of streams into a single stream
				.forEach(System.out::println); // Print each first name

		
		
//		In this example:
//
//			map(User::getFName) transforms each User object into its first name.
//			flatMap(Stream::of) flattens the resulting stream of streams into a single stream of first names.
//			Finally, forEach(System.out::println) prints each first name.
//			This approach is useful when you want to extract a property from each object in a list and then process or operate on those extracted properties as a single stream.
//
//			However, in your provided data, if you're not interested in flattening any nested structures or transforming each element into multiple elements, you may not necessarily need to use flatMap().
//			It depends on your specific use case and data structure.
		
	}

}
