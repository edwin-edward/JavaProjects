package org.interfacess;

public class InterDemo3 implements InterDemo1,InterDemo2{

	@Override
	public void forLoop2() {
		for(char i='A'; i<='E'; i++) {
			for(char j='A'; j<='E'; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	@Override
	public void forLoop1() {
		for(char i='A'; i<='E'; i++) {
			for(char j='A'; j<='E'; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		InterDemo3 i = new InterDemo3();
		i.forLoop1();
		i.forLoop2();
	}
}
