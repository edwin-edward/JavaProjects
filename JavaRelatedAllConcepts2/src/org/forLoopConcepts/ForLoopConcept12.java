package org.forLoopConcepts;

public class ForLoopConcept12 {

	public static void main(String[] args){
		//output  A B C D E
		//		A B C D  
		//		A B C  
		//		A B  
		//		A 
	for(char i='A'; i<='E'; i++){
		for(char j=i; j<='E'; j++){
			System.out.print(j+"  ");
	}
			System.out.println();
	}
}
}
