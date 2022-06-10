package com.java.assessmentpart3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		try {
			FileReader fr =  new FileReader("demofile/sample1.txt");
			BufferedReader br = new BufferedReader(fr);
			
		
			try(FileWriter fw = new FileWriter("demofile/sample12.txt")){
				String s = null;
				while((s= br.readLine())!=null) {
					if(s.contains("warm")||s.contains("error")||s.contains("fatel"))
					{
						fw.write(s);
						System.out.println("done");
					}
					else {
						System.out.println("Not done");
					}
				}
			}catch (FileNotFoundException  ie) {
					ie.printStackTrace();
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
