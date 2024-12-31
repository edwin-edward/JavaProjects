package org.arraysss;

public class ArrayIsHighMemoryWastage {

	public static void main(String[] args){
		
		int [] a = new int[10];
			a[0] = 100;
			a[1] = 200;
			System.out.println(a.length);
			
			for(int i=a.length-1; i>=0; i--) {
				System.out.println(a[i]);
			}
	}

}
