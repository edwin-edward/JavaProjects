package org.javaInterviewQuestions;

public class RemoveTheWhiteSpaces{
	public static void main(String[] args){
		String s = "   J       A      V     A    ";
	
	String removeWhiteSpaces = s.replaceAll("   J       A      V     A    ","JAVA");
	System.out.println(removeWhiteSpaces);

	String removeWhiteSpaces2 = s.replaceAll("\\s","");
	System.out.println(removeWhiteSpaces2);

		}
}

