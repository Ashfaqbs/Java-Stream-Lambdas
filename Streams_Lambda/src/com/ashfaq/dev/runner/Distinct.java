package com.ashfaq.dev.runner;

import com.ashfaq.dev.utils.ListData;

public class Distinct {
	public static void main(String[] args) {
//need to 

//		 @Override
//		    public boolean equals(Object o) {
//		        if (this == o) return true;
//		        if (o == null || getClass() != o.getClass()) return false;
//		        User user = (User) o;
//		        return id == user.id;
//		    }
//
//		    @Override
//		    public int hashCode() {
//		        return Objects.hash(id);
//		    }

//		distinct based on id
		long count = ListData.listLoader().stream().count();
		long count2 = ListData.listLoader().stream().distinct().count();

		System.out.println(count);
		System.out.println(count2);

	}
}
