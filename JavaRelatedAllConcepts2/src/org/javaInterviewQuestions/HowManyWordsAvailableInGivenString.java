package org.javaInterviewQuestions;

public class HowManyWordsAvailableInGivenString{
	public static void main(String[] args){

	String s = "Java Selenium Maven DataDriven TestNG";

	int count = 0;
	String[] split = s.split(" ");
	for(String ss : split){
		count++;
	}	
System.out.println(count);
}
}

