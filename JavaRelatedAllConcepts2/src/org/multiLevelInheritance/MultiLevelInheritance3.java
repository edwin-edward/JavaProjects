package org.multiLevelInheritance;

public class MultiLevelInheritance3 extends MultiLevelInheritance2{

	public void numberPatternProgram3() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MultiLevelInheritance3 m = new MultiLevelInheritance3();
		m.numberPatternProgram1();
		System.out.println();
		m.numberPatternProgram2();
		System.out.println();
		m.numberPatternProgram3();
	}
}
