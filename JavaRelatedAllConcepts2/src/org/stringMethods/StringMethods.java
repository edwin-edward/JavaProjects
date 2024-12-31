package org.stringMethods;

public class StringMethods{
	public static void main(String[] args){
	
	String s1 = "Java";
	String s2 = "Selenium";

	int len = s2.length();
	System.out.println(len);

	boolean eq = s1.equals(s2);
	System.out.println(eq);

	boolean eqI = s1.equalsIgnoreCase(s2);
	System.out.println(eqI);

	String up = s1.toUpperCase();
	System.out.println(up);

	String lo = s2.toLowerCase();
	System.out.println(lo);

	boolean st = s1.startsWith("J");
	System.out.println(st);

	boolean end = s1.endsWith("J");
	System.out.println(end);

	int index = s1.indexOf("a");
	System.out.println(index);

	int index1 = s2.lastIndexOf("a");
	System.out.println(index1);

	boolean con = s2.contains("a");
	System.out.println(con);

	String conc = s1.concat(s2);
	System.out.println(conc);

	char ch = s1.charAt(3);
	System.out.println(ch);

	String rep = s1.replace("Java","Maven");
	System.out.println(rep);

	String sub = s2.substring(5);
	System.out.println(sub);

	String[] split = s2.split("e");
	for(String ss : split){
		System.out.println(ss);
	}

	String s3 = "     DataDriven       ";

	String trim = s3.trim();
	System.out.println(trim);

	boolean is = s3.isEmpty();
	System.out.println(is);

	String s4 = "-";
	String[] s5 = {"Java","Selenium","Maven","TestNG"};
	String join = String.join(s4,s5);
	System.out.println(join);

	String s6 = "12345";
	int integer = Integer.parseInt(s6);
	System.out.println(integer);

	int a = 12345;
	String str = String.valueOf(a);
	System.out.println(str);

	String s7 = "Kumaran12345";
	String sub2 = s7.substring(0,7);
	System.out.println("FirstOf : "+sub2);
	String sub3 = s7.substring(7,12);
	System.out.println("SecondOf : "+sub3);

	String s8 = "Kumaran";
	int b = 857644;
	
	String strr = String.valueOf(b);
	System.out.println(strr);
	String conn = s8.concat(strr);
	System.out.println(conn);
}
}


