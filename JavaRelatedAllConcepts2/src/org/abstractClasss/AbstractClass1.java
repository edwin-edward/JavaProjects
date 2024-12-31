package org.abstractClasss;

public abstract class AbstractClass1 {

	static {
		System.out.println("This is Static block");
	}
	{
		System.out.println("This is Instance block");
		System.out.println("This method is when we Create the Object for constructor then it will automatically triggered.");
	}
	public AbstractClass1() {
		System.out.println("This is Non-Parameterized Constructor");
	}
	public void instanceMethod() {
		System.out.println("This is instance method");
	}
	public static void staticMethod() {
		System.out.println("This is Static method");
	}
	public abstract void abstractMethod();
}
