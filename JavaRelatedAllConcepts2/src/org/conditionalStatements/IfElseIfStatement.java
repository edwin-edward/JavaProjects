package org.conditionalStatements;

public class IfElseIfStatement{
	public static void main(String[] args){
		int a = 49;
		if(a<90 && a>100){
			System.out.println("Given Integer Below 100 Above 90");
		}else if(a<89 && a>80){
			System.out.println("Given Integer Below 90 Above 80");
		}else if(a<79 && a>70){
			System.out.println("Given Integer Below 80 Above 70");
		}else if(a<69 && a>60){
			System.out.println("Given Integer Below 70 Above 60");
		}else if(a<59 && a>50){
			System.out.println("Given Integer Below 60 Above 50");
		}else{
			System.out.println("Given Integer Below 50");

		}



}
}

