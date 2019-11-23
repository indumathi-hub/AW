package org.fil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Que1 {
	public static void main(String[] args) throws Throwable {
		File f=new File("D:\\indu");
		boolean b = f.mkdir();
		System.out.println(b);
		File f1=new File("D:\\indu\\rag.txt");
		boolean c = f1.createNewFile();
		System.out.println(c);
		File f2=new File("D:\\indu\\rag.txt");
		FileUtils.write(f2, "Greens Technology is recognized for its Selenium Training in both retail and corporate market. We have trained above 28,000 students exclusively on QTP and Selenium in last 7 years.All our trainers’ expertises on both development and training which helps us deliver project based training.");
	}

}
