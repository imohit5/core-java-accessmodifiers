package testB;

import testA.ExampleA;

public class ExampleD {
	

	public static void main(String[] args) {

		ExampleA objectA = new ExampleA();
		
		//cannot access a,b,c. but c can be inherited
		//System.out.println(objectA.a);
		//System.out.println(objectA.b);
		//System.out.println(objectA.c);
		System.out.println(objectA.d);
		
		
		
	}

}
