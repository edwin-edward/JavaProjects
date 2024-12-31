package org.variables;

public class LocalStaticClass {

	int a = 10;  					
	static int b = 20;
	
	public void m1() {
		int a =100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		LocalStaticClass l = new LocalStaticClass();
		l.m1();
	}
}
