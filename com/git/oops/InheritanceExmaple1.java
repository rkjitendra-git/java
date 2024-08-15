package com.git.oops;
/** 
 * 
 * @author rahul
 *
 */

class ClassA {
	private final int a;
	public ClassA(){
		this(0);
		System.out.println("constructer of classA");
	}
	public ClassA(int b){
		a=b;
		System.out.println("parametirzed constructer of classA");
	}
	protected  void display(){
		System.out.println("display method of classA");
	}
}

class ClassB extends ClassA{
	
	public ClassB(){
		super();
		System.out.println("constructer of classB");
	}
	
	public  void  display(){
		System.out.println("display method of classB");
	}
}

public class InheritanceExmaple1{
	public static void main(String[] args) {
		ClassA a=new ClassB();
		a.display();
	}
	
   /*
    	 	
 	output=
	parametirzed constructer of classA
	constructer of classA
	constructer of classB
	display method of classB
	
	*if display method of both class will static then
	
	output=
	parametirzed constructer of classA
	constructer of classA
	constructer of classB
	display method of classA
	
	*/
	
	
}


