package org.arraysss;

public class ArrayConcepts {

	public static void main(String[] args){
		int [] a = {23,45,67,89,14,48,59,18,39};

		System.out.println(a.length);
		System.out.println(a.length-1);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println();
		for(int ss : a) {
			System.out.println(ss);
		}
	}

}
