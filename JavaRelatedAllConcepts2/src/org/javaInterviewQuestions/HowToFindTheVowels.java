package org.javaInterviewQuestions;

public class HowToFindTheVowels{
	public static void main(String[] args){

	String s = "JavaSelenium";
	
	char[] charArray = s.toCharArray();
	for(int i=0; i<charArray.length; i++){
		if(s.charAt(i)=='a'||
		s.charAt(i)=='e'||
		s.charAt(i)=='i'||
		s.charAt(i)=='o'||
		s.charAt(i)=='u'){
	System.out.print(charArray[i]);
	}
	}	
}
}
