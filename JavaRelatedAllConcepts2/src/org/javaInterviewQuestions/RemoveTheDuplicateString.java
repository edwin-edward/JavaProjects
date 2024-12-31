package org.javaInterviewQuestions;
import java.util.Set;
import java.util.TreeSet;

public class RemoveTheDuplicateString{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add("Java");
		set.add("Java");
		set.add("Selenium");
		set.add("Selenium");

	System.out.println(set);
	
	for(Object ss : set) {
	System.out.println(ss);
	}
}
}