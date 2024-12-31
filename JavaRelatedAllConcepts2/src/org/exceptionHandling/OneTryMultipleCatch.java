package org.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OneTryMultipleCatch {

	public static void main(String[] args) {
		try {
		List list = new ArrayList();
		list.add("Java");
		System.out.println(list.get(1));
		}catch(ArithmeticException e) {
			System.out.println("This is mathematical issue");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("This is IndexOutOfBoundException");
		}catch(Exception e) {
			System.out.println("something went wroung");
		}
	}
}
