package org.methodOverriding;

public class EdgeBrowser extends WebBrowser{

	public void maximize() {
		System.out.println("This method is used to maximize the edge browser window");
	}
	public void minimize() {
		System.out.println("This method is used to minimize the edge browser window");
	}
	
	public static void main(String[] args) {
		WebBrowser chrome = new ChromeBrowser();
		WebBrowser firefox = new FirefoxBrowser();
		WebBrowser edge = new EdgeBrowser();
		
		chrome.maximize();
		firefox.maximize();
		edge.maximize();
	}
}
