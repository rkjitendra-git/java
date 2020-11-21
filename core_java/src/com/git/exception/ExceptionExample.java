package com.git.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		method1();

	}

	public static void method1(){
		System.out.println("Inside Method1");
		
		
		//*checked exception, then the method must either handle the exception 
		//or it must specify the exception using throws keyword.
		
//		throw new Exception();// give compile error because we have not handle the exception 
//		throw new IllegalAccessException();// give compile error
//		throw new IllegalStateException();// give compile error
		
		//* Java exceptions under Error and RuntimeException classes are unchecked exceptions,
		//everything else under throwable is checked.
		throw new IllegalAccessError(); //compiled successfully!
//		throw new NullPointerException();
		
		/**
		 * you can test above example at http://tpcg.io/oIa0PUh9 online
		 */
	}
}
