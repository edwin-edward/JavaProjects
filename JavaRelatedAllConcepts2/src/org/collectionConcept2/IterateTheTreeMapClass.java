package org.collectionConcept2;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class IterateTheTreeMapClass{
	public static void main(String[] args){
		TreeMap<String,Integer> map = new TreeMap();

		map.put("Manual",1000);
		map.put("Testing",2000);
		map.put("BlackBox",3000);
		map.put("Chaining",4000);
		map.put("Deploy",5000);
		map.put("Engineer",6000);
		map.put("Software",7000);
		map.put("Api",8000);
		map.put("Unit Testing",9000);

		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entrySets : entrySet){
			System.out.println(entrySets.getKey());
			System.out.println(entrySets.getValue());
		}
		
}
}
