package org.forLoopConcepts;

public class ForLoopConcept9 {

	public static void main(String[] args) {
				//output    A A A A A
				//					B B B B B   
				//					C C C C C 
				//					D D D D D
				//					E E E E E
		for(char i='A'; i<='E'; i++) {
			for(char j='A'; j<='E'; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
}
