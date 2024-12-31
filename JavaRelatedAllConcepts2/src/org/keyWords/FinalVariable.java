package org.keyWords;

public class FinalVariable {

	final static int a = 10;
	public void m1() {
		// a = 200;
		System.out.println(a);
	}
	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.m1();
	}
	
}
