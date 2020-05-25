package ctr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Application { 

	public static void main(String[] args) throws IOException {

		String filename = "C:\\Users\\Dizzle\\WorkSpaces\\Eclipse\\Informatik1\\Readme.me";
		File file = new File(filename);
		Reader reader = new FileReader(file);
		LineReader lines = new LineReader(reader);
		for (String line : lines)
			System.out.println(line);
		for (String line : lines)
			System.out.println(line);
	}

}
