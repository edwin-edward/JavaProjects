package org.collectionConcepts;
import java.util.List;
import java.util.LinkedList;

public class LinkedListss{
	public static void main(String[] args){
		List list = new LinkedList();
		list.add(120);
		list.add(1234);
		list.add(1234567);
		list.add(12345678912345l);
		list.add(123.34f);
		list.add(123412233435453d);
		list.add('A');
		list.add(true);
		list.add("String");

		System.out.println(list.size());
		Object getValue = list.get(3);
		System.out.println(getValue);
		Object charValue = list.set(6,'S');
		Object ch = list.get(6);
		System.out.println(ch);

		List list1 = new LinkedList();
		list1.add("Java");
		list1.add("Selenium");

		list1.addAll(list);
		System.out.println(list1);

		list1.remove("String");

		System.out.println(list1);

		boolean con = list1.contains(true);
		System.out.println(con);

		int index = list1.indexOf("Selenium");
		System.out.println(index);

		list1.clear();

		System.out.println(list1);
}
}

