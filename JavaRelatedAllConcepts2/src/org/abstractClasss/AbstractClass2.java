package org.abstractClasss;

public class AbstractClass2 extends AbstractClass1{

	@Override
	public void abstractMethod() {
		System.out.println("This is abstract Method");
	}
	public static void main(String[] args) {
		AbstractClass2 a = new AbstractClass2();
		a.instanceMethod();
		staticMethod();
		a.abstractMethod();
	}

}
