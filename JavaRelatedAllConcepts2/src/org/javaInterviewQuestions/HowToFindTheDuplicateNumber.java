package org.javaInterviewQuestions;

public class HowToFindTheDuplicateNumber{
	public static void main(String[] args){

	int [] a = {3,4,2,1,2,3,4,1,5,6,7,8,7,6,5,8,9,0,9,0};

	for(int i=0; i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
			if(a[i]==a[j]){
				System.out.print(a[i]+",");
		}
	}
	}
	}
}
