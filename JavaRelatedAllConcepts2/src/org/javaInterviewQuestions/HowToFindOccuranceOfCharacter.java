package org.javaInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class HowToFindOccuranceOfCharacter {
	public static void main(String[] args) {

		String s = "Java";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap();

		for(Character ch : charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
	}
}
