package ctr;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestJUnit4{


	static String filename = "C:\\Users\\Dizzle\\WorkSpaces\\Eclipse\\Informatik1\\Readme.me";
	static File file = new File(filename);
	static Iterator<String> linesIterator;
	static String str = "ls: cannot read symbolic link 'Anwendungsdaten': Permission denied\r\n";
	static StringReader stringReader = new StringReader(str);
	static LineReader lines;

	@Before
	public void init() {

	}

	static public int gibString() throws IOException {
		return stringReader.read();
	}

	@Parameters
	public static Reader reader() throws IOException {

		Reader reader = null;

		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lines = new LineReader(reader);

		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		linesIterator = lines.iterator();

		return reader;
	}

	@Test
	public void LineReaderTest() {
		for (String line : lines)
			System.out.println(line);
	}
	


	@Test
	public void testIterator() throws IOException {

		// assertTrue("Same String",
		// (linesIterator.next().equals(stringReader.skip(6))));
		assertEquals(stringReader.read(), linesIterator.next());
	}

	@Test
	public void iteratorStringReaderTest() throws IOException {

		String line = linesIterator.next();

		for (int i = 0; i < line.length(); i++) {
			assertTrue(stringReader.ready());
			assertEquals(line.charAt(i), stringReader.read());
		}
	}

	@Test
	public void skipTest() throws IOException {
		// int skipped = stringReader.
	}

	@Test
	public void testGleicheAusgabe() {

		String str = "ls";
		StringReader stringReader = new StringReader(str);

		int ch = 0;
		try {
			ch = stringReader.read();
			char stringReaderToString = (char) ch;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

//	@BeforeClass
//public static void readFile() {
//
//	Reader reader = null;
//
//	try {
//		reader = new FileReader(file);
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	LineReader lines = new LineReader(reader);
//
//	try {
//		reader = new FileReader(file);
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}
//
//	// IteratorIterable iterator = new IteratorIterable(null);
//	
//
//}


