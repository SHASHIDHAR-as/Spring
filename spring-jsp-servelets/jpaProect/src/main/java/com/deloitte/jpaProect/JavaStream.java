package com.deloitte.jpaProect;

import java.util.ArrayList;
import java.util.List;

public class JavaStream {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Shashi");
		list.add("Shashi");
		list.add("Shai");
		list.add("karan");
		
		list.stream()
//		 .filter(s -> s.startsWith("S"))
		 .distinct()
		 .sorted()
		 .map(s->s.toUpperCase())
		 .forEach(System.out::println);

	}

}
