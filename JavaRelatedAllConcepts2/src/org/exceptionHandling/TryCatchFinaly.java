package org.exceptionHandling;

public class TryCatchFinaly {

	public static void main(String[] args) {
		try {
		int[] a = {34,45,56,67,78,89};
		
		System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User ask Out Of Index Number");
		}
		finally {
			System.out.println("Whether the exception occured or not the finally block will be executed automatically at the time itself");
		}
	}
}
