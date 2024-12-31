package org.twoDimentionalArray;

public class TwoDimentionalArray{
	public static void main(String[] args){
		int[][] a = {{10,20,30,40,50,60,70,80},
				{12,23,34,45,56,67},
				{21,32,43,54,65,76,87},
				{98,87,76,65,54,43,32,21},
				{11,22,33,44},
				{42,52,63,73,74},
				{88,77,66,55,44,33},
				{91,82,73,74,65,59,27},
				{56,86,35,75,28,96}
					};

	System.out.println(a.length);
	System.out.println(a.length-1);

	System.out.println(a[4].length);

	for(int i=0; i<a.length; i++){
		System.out.println(a[i].length);
	}
//	for(int i=0; i<a.length; i++) {
//		if(a[i].length==4) {
//			System.out.println(i);
//		}
//	}
	for(int aa[] : a) {
		for(int bb : aa) {
			System.out.print(bb+"|");
		}
		System.out.println();
	}
	}
}

