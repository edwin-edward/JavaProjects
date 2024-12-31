package org.constructorss;

public class ConstructorClass2 extends ConstructorClass1{

	int a = 400;
	static int b = 500;

	public ConstructorClass2() {
		System.out.println(this.a);
		System.out.println(b);
		int a = 600;
		System.out.println(a);
		System.out.println("This is child Class Non-Parameterized Constructor");
	}

	public ConstructorClass2(int a) {
		super(10);
		staticMethod2();
		System.out.println("This is child Class Parameterized Constructor");
	}
	public void instanceMethod2() {
		System.out.println("This is child Class Instance Method");
	}
	public static void staticMethod2() {
		System.out.println("This is child Class Static Method");
	}
	{
		System.out.println("This is child Class Instance Block");
	}
	public static void main(String[] args) {
		ConstructorClass2 c = new ConstructorClass2();
		ConstructorClass2 c1 = new ConstructorClass2(10);
		c.instanceMethod();
		c.instanceMethod2();
		
		
	}
}
