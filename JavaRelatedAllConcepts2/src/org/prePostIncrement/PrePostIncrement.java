package org.prePostIncrement;

public class PrePostIncrement{
	public static void main(String[] args){
		int i = 10;
		System.out.println(i++ + --i + i-- + ++i - --i - ++i + i++ - i++ - i--);

		//10=i++=10(11)
		//	--i=10
		//	i--=10(9)
		//	++i=10
		//	--i=9
		//	++i=10
		//	i++=10(11)
		//	i++=11(12)
		//	i--=12(11)
//10+10+10+10-9-10+10-11-12
//50-42=8
}
}
