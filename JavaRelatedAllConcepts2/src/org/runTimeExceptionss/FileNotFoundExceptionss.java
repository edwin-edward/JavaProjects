package org.runTimeExceptionss;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileNotFoundExceptionss {

	public static void main(String[] args) throws IOException {
		File file = new File("\\src\\org\\forLoopConcepts");
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
	}
}
