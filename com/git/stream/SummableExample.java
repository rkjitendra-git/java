package com.git.stream;


public class SummableExample {

	public static void main(String[] args) {
		Summable sum=(a,b)->a+b;
		System.out.println(sum.add(1, 2));
	}
}
