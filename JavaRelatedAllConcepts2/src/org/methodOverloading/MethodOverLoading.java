package org.methodOverloading;

public class MethodOverLoading{
	public void methodOverloading(){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(i+"  ");
		}
		System.out.println();
		}
		System.out.println();
	}
	public void methodOverloading(int a){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(j+"  ");
		}
		System.out.println();
		}
		System.out.println();
	}
	public void methodOverloading(int a, int b){
		for(int i=1; i<=5; i++){
			for(int j=i; j<=5; j++){
				System.out.print(i+"  ");
		}
		System.out.println();
		}
		System.out.println();
	}
	public void methodOverloading(int a,int b,int c){
		for(int i=1; i<=5; i++){
			for(int j=i; j<=5; j++){
				System.out.print(j+"  ");
		}
		System.out.println();
		}
		System.out.println();
	}
	public void methodOverloading(int a,int b,int c,int d){
		for(char i='A'; i<='E'; i++){
			for(char j='A'; j<='E'; j++){
				System.out.print(i);
		}
		System.out.println();
		}
		
	}

	public static void main(String[] args){
		MethodOverLoading m = new MethodOverLoading();
		m.methodOverloading();
		m.methodOverloading(100);
		m.methodOverloading(100,200);
		m.methodOverloading(100,200,300);
		m.methodOverloading(100,200,300,400);
}
}
