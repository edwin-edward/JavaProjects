package org.hierarchicalInheritance;

public class HierarchicalInheritance3 extends HierarchicalInheritance1{

	public void numberPatternProgram3() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		HierarchicalInheritance3 h = new HierarchicalInheritance3();
		HierarchicalInheritance2 h1 = new HierarchicalInheritance2();
		h.numberPatternProgram1();
		System.out.println();
		h.numberPatternProgram3();
		System.out.println();
		h1.numberPatternProgram2();
	}
}
