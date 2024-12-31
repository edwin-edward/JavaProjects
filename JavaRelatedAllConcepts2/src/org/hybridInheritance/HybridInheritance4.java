package org.hybridInheritance;

public class HybridInheritance4 implements HybridInheritance2,HybridInheritance3{

	@Override
	public void numberPatternProgram3() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}

	@Override
	public void numberPatternProgram2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

	@Override
	public void numberPatternProgram1() {
		{
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
	}
	public static void main(String[] args) {
		HybridInheritance4 h = new HybridInheritance4();
		h.numberPatternProgram1();
		System.out.println();
		h.numberPatternProgram2();
		System.out.println();
		h.numberPatternProgram3();
	}

}
