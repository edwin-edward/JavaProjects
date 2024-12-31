package org.forLoopConcepts;

public class ForLoopConcept13 {

	public static void main(String[] args){
		//output  A B C D E
		//		A B C D  
		//		A B C  
		//		A B  
		//		A 
	for(char i='A'; i<='E'; i++){
		for(char j='A'; j<=i; j++){
			System.out.print("A  ");
	}
			System.out.println();
	}
}
}
