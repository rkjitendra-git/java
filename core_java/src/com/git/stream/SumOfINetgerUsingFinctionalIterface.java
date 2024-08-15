package com.git.stream;

@FunctionalInterface
interface Summable {

	int add(int a, int b);
}



class SumOfINetgerUsingFinctionalIterface {
 
 public static void main(String[] args) {
	 Summable sum=(x,y)->x+y;
	 System.out.println(sum.add(10, 11));
}
}
