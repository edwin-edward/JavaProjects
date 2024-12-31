package org.collectionConcepts;
import java.util.TreeSet;

public class TreeSetClass{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add("Java");
		set.add("Selenium");
		set.add("Maven");
		set.add("DataDriven");
		set.add("TestNG");
		set.add("Cucumber");
		set.add("API Testing");
		set.add("Postman");
		set.add("RestAssured");

	System.out.println(set.size());
	System.out.println(set);

	TreeSet set1 = new TreeSet();
		set1.add("Manual Testing");
		set1.add("Jira");
		set1.add("Git");
		set1.add("SQL");

		set.addAll(set1);
		System.out.println(set);

		set.remove("SQL");
		System.out.println(set);

		boolean con = set.contains("SeleniumRC");
		System.out.println(con);
}
}
