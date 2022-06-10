package com.java.assessmentpart3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFilesFromType {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("/home/vastpro/Pictures/logo.png");
			os = new FileOutputStream("demofile/new.png");
			// buffer size 1K
			byte[] buf = new byte[1024];
			int bytesRead;
			try {
				while ((bytesRead = is.read(buf)) > 0) {
					os.write(buf, 0, bytesRead);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}