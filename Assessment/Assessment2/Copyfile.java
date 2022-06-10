package com.java.assessmentpart3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Copyfile {
	public static void main(String []args)
	{
		try
		{
			File fold=new File("demofile");
			if(!fold.exists())
				fold.mkdir();
			FileWriter fw1=new FileWriter("demofile/sample1.txt");
			BufferedWriter bw =new BufferedWriter(fw1);
			bw.write("I am Akshay");
			bw.write("\nThis is my file");
			bw.write("\nToday is so warm");
			bw.write("\nTheir is error");
			bw.write("fatal");
			bw.close();
			FileReader fr1=new FileReader("demofile/sample1.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			String s=null;
			while((s=br1.readLine())!=null)
			{
				System.out.println(s);
			}
		}
		catch(IOException q)
		{
			q.printStackTrace();
		}
	}
}
