package ctr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class LineReader implements Iterable<String>{
	
	private BufferedReader reader;
	IteratorReader it;

	
	public LineReader(Reader in) throws IOException {
		System.out.println("In LineReader");
		reader = new BufferedReader(in);
		it = new IteratorReader(reader);
	}
		
	
	@Override
	public Iterator<String> iterator() {
		return it;
	}

}
