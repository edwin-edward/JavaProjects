package org.collectionConcept2;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;


public class IterateTheLinkedLists{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		list.add(123);
		list.add(1234);
		list.add(1234567);
		list.add(1234567891234l);
		list.add(12345.45f);
		list.add(12345678912345678d);
		list.add('K');
		list.add(true);
		list.add("Kumaran");
		
		System.out.println(list);
		System.out.println();

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println();
		for(Object ss : list){
			System.out.println(ss);
		}
		System.out.println();
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println();
		ListIterator liIter = list.listIterator();
		while(liIter.hasNext()){
			System.out.println(liIter.next());
		}
		System.out.println();
		while(liIter.hasPrevious()){
			System.out.println(liIter.previous());
		}
		System.out.println();
		Iterator<Object> deIter = list.descendingIterator();
		while(deIter.hasNext()){
			System.out.println(deIter.next());
		}
}
}
