package org.collectionConcept2;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class IterateTheLinkedHashSetClass{
	public static void main(String[] args){
		Set set = new LinkedHashSet();

		set.add(123);
		set.add(1234);
		set.add(1234567);
		set.add(1234567891234l);
		set.add(12345.45f);
		set.add(12345678912345678d);
		set.add('K');
		set.add(true);
		set.add("Kumaran");

		System.out.println(set);
		System.out.println();

		for(Object ss : set){
			System.out.println(ss);
		}
		System.out.println();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
}
}
