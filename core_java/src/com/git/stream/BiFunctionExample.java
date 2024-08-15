package com.git.stream;

import java.util.function.BiFunction;

public class BiFunctionExample {
	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add= (a,b)->(a+b);
		
		Integer sum= add.apply(5, 4);
		
		System.out.println(sum);
		
	}

}
