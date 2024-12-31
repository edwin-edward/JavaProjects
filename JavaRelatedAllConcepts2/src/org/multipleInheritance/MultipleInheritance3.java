package org.multipleInheritance;

public class MultipleInheritance3 implements MultipleInheritance1,MultipleInheritance2{

	@Override
	public void forLoopConcept2() {
		for(int i=110; i>=100; i--) {
			System.out.println(i);
		}
	}

	@Override
	public void forLoopConcept1() {
		for(int i=110; i>=100; i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		MultipleInheritance3 m = new MultipleInheritance3();
		m.forLoopConcept1();
		System.out.println();
		m.forLoopConcept2();
	}

}
