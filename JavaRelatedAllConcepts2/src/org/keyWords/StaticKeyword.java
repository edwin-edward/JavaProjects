package org.keyWords;

public class StaticKeyword {

	static int a = 100;
	public static void m1() {
		int a = 200;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		StaticKeyword s = new StaticKeyword();
		m1();
		System.out.println(a);
	}
}
