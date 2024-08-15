package com.git.java8;

@FunctionalInterface
interface LamdaFunction{
	void callme();
}

public class LamdaAndFunctionIntefaceExample {

	public static void main(String[] args) {
		
		String str="Hello Lamda Experssion";
		LamdaFunction lf=()->System.out.println(str+" Java 8");
//		str="Bye Bye"; // if you uncomment this line you will get compile error-variable should be must in scope
		lf.callme();
	}

}
