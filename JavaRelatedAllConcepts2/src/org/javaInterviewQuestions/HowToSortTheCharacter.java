package org.javaInterviewQuestions;

public class HowToSortTheCharacter{
	public static void main(String[] args){

	String s = "java";
	
	char[] charArray = s.toCharArray();
	char temporaryVariable;
	
	for(int i=0; i<charArray.length; i++){
		for(int j=i+1; j<charArray.length; j++){
			if(charArray[i]>charArray[j]){
				temporaryVariable = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temporaryVariable;
	}
	}
	}
			System.out.println(charArray);

	
}
}

