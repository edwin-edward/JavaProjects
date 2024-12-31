package org.javaInterviewQuestions;
import java.util.Set;
import java.util.TreeSet;

public class HowToRemoveDuplicateNumber{
	public static void main(String[] args){

	int [] a = {3,4,2,1,2,3,4,1,5,6,7,8,7,6,5,8,9,0,9,0,8};

	Set set  = new TreeSet();
	
	for(int i=0; i<a.length; i++){
		set.add(a[i]);
	}
	System.out.println(set);
	for(Object ss : set) {
		System.out.print(ss+",");
	}
	}
}
