package org.forLoopConcepts;

public class ForLoopConcept4 {

	public static void main(String[] args) {
		//output    1 2 3 4 5
		//					1 2 3 4 5
		//					1 2 3 4 5
		//					1 2 3 4 5
		//					1 2 3 4 5
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
}
