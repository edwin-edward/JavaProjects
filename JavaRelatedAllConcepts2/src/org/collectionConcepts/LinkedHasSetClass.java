package org.collectionConcepts;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHasSetClass{
	public static void main(String[] args){
		Set set = new LinkedHashSet();

		set.add(120);
		set.add(1234);
		set.add(1234567);
		set.add(12345678912345l);
		set.add(123.34f);
		set.add(123412233435453d);
		set.add('A');
		set.add(true);
		set.add("String");

	System.out.println(set.size());

	Set set1 = new LinkedHashSet();
		set1.add("Maven");
		set1.add("DataDriven");

		set.addAll(set1);
		System.out.println(set);

		set.remove(123.34f);
		System.out.println(set);

		boolean con = set.contains(123412233435453d);
		System.out.println(con);
}
}
