package org.twoDimentionalArray;

public class FindTheLargestNumber {

	public static void main(String[] args) {
		int [] a = {34,56,23,67,45,78,34,94};
		
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
		}
		System.out.println(max);
	}
}
