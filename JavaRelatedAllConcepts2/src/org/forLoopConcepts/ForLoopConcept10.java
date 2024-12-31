package org.forLoopConcepts;

public class ForLoopConcept10 {

	public static void main(String[] args) {
		//output    A B C D E
		//					A B C D E  
		//					A B C D E  
		//					A B C D E 
		//					A B C D E 
		for(char i='A'; i<='E'; i++) {
			for(char j='A'; j<='E'; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
}
