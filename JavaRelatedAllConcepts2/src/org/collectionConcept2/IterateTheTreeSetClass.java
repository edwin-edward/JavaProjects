package org.collectionConcept2;
import java.util.TreeSet;
import java.util.Iterator;


public class IterateTheTreeSetClass{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add("Manual");
		set.add("Testing");
		set.add("BlackBox");
		set.add("Chaining");
		set.add("Deploy");
		set.add("Engineer");
		set.add("Software");
		set.add("Api");
		set.add("Unit Testing");

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
		System.out.println();
		Iterator<Object> deIter = set.descendingIterator();
		while(deIter.hasNext()){
			System.out.println(deIter.next());
		}
}
}
