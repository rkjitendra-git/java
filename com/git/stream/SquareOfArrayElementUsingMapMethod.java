package com.git.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfArrayElementUsingMapMethod {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,45,5);
		
//		map method example
		List<Integer> sq=list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Map method exmaple" + sq);
		
		
	}
	 
}

