package org.arraysss;

public class HowToOvercomeInArraySimilarDataType {

	public static void main(String[] args) {
		Object[] a = {121,7456,784365,74385634786l,465.76f,7465767648756d,'S',true,"Java"};
		
		for(Object ss : a) {
			System.out.println(ss);
		}
		System.out.println(a[6]);
	}
}
