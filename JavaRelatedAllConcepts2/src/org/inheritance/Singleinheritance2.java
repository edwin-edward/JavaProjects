package org.inheritance;

public class Singleinheritance2 extends Singleinheritance1{

	public void forLoopConcept2() {
		for(int i=100; i<=120; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Singleinheritance2 s = new Singleinheritance2();
		s.forLoopConcept();
		System.out.println();
		s.forLoopConcept2();
	}
}
