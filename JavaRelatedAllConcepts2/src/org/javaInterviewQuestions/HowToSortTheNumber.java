package org.javaInterviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class HowToSortTheNumber {
	public static void main(String[] args) {

		int[] a = { 9, 8, 4, 5, 2, 6, 1, 7, 3, 0 };

		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int ss : a) {
			System.out.print(ss+",");
		}
	}
}
