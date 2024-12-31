package org.collectionConcepts;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class TreeMapClass{
	public static void main(String[] args){
		TreeMap<Character,Integer> map = new TreeMap();

		map.put('A',100);
		map.put('B',200);
		map.put('C',300);
		map.put('D',400);
		map.put('E',500);
		map.put('F',600);
		map.put('G',700);

	System.out.println(map);

	System.out.println(map.size());

	System.out.println(map.get('D'));

	Set<Character> keySets = map.keySet();
	for(Character keys : keySets){
		System.out.println(keys);
	}
	
	Collection<Integer> valuesOnly = map.values();
	for(int value : valuesOnly){
		System.out.println(value);
	}
	
	boolean con = map.containsKey('B');
	System.out.println(con);

	boolean con2 = map.containsValue(600);
	System.out.println(con2);

	Set<Entry<Character,Integer>> entrySet = map.entrySet();
	for(Entry<Character,Integer> entry : entrySet){
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}

