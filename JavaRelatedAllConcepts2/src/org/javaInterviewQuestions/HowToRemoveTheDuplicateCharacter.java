package org.javaInterviewQuestions;
import java.util.Set;
import java.util.TreeSet;

public class HowToRemoveTheDuplicateCharacter{
	public static void main(String[] args){

	String s = "Java";
	
	Set set = new TreeSet();

	for(int i=0; i<s.length(); i++){
		set.add(s.charAt(i));
	}			
	System.out.println(set);
	for(Object ss : set){
		System.out.print(ss);
	}
	
}
}
