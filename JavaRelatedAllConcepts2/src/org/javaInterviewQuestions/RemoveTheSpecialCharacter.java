package org.javaInterviewQuestions;

public class RemoveTheSpecialCharacter{
	public static void main(String[] args){
		String s = "@J#a$v%a*";
	
	String removeSpacialCharacter = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(removeSpacialCharacter);

		char[] charArray = s.toCharArray();
	for(int i=0; i<s.toCharArray().length; i++){
		if(s.charAt(i)=='J'||
		s.charAt(i)=='a'||
		s.charAt(i)=='v'||
		s.charAt(i)=='a'){
	System.out.print(charArray[i]);
	}
	}
	}
}
