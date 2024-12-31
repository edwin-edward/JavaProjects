package org.exceptionHandling;

public class ThrowThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		try {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		Thread.sleep(2000);
		}catch(ArithmeticException e) {
			throw new  ArrayIndexOutOfBoundsException("Mathematical issue");
		}
	}
}
