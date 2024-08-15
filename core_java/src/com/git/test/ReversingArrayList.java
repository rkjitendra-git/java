package com.git.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReversingArrayList {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("AWS");
		myList.add("Java");
		myList.add("Python");
		myList.add("Blockchain");
		
		
		Iterator<String> iterator=myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}