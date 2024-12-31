package org.keyWords;

public class FinalMethod2 extends FinalMethod1{
	
	public void maximize() {
		System.out.println("This Method is used to maximize The chrome browser window");
	}
	public static void main(String[] args) {
		FinalMethod1 f = new FinalMethod2();
		f.maximize();
	}
}
