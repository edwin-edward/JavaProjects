package org.constructorss;

public class ConstructorClass1 {
	int a = 100;
	static int b = 200;

	public ConstructorClass1() {
		System.out.println(this.a);
		System.out.println(b);
		int a = 300;
		System.out.println(a);
		System.out.println("This is Parent Class Non-Parameterized Constructor");
	}

	public ConstructorClass1(int a) {
		this();
		staticMethod();
		System.out.println("This is Parent Class Parameterized Constructor");
	}
	public void instanceMethod() {
		System.out.println("This is Parent Class Instance Method");
	}
	public static void staticMethod() {
		System.out.println("This is Parent Class Static Method");
	}
	{
		System.out.println("This is Parent Class Instance Block");
	}

}
