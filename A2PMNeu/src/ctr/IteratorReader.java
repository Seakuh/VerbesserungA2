package ctr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.Collection;
import java.util.stream.Stream;

public class IteratorReader implements java.util.Iterator<String> {

	BufferedReader reader;
	Stream stringCollection;
	int lineNumber = 0;
	long lines = 1;
	LineNumberReader numberReader;
	String line = ""; 
	boolean next = true;
	

	public IteratorReader(BufferedReader readerIn) throws IOException {
		//System.out.println("In IteratorReader");
		reader = readerIn;
		BufferedReader readerClone = new BufferedReader(readerIn);
		//stringCollection = readerClone.lines();
		//lines = stringCollection.count();
		//System.out.println("Lines: " + lines);

	}

	@Override
	public boolean hasNext() {
		//System.out.println("In hasNext()");
		//next = (lineNumber < lines);
		//System.out.println("Next: " + next + "\t Lines:" + lines + "\t lineNumber:" + lineNumber);
		return next; 
	}

	@Override
	public String next() {
		//System.out.println("In next()");
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(line);
		lineNumber++;
		if(line==null) {
			next=false;
			return "";
		}
		return line;
	}

}
