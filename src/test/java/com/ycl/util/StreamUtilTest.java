package com.ycl.util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.Test;

class StreamUtilTest {

	@Test
	void testCloseAll() throws FileNotFoundException {
		
	}

	@Test
	void testReadTextFileInputStream() throws FileNotFoundException {
		String str="I:\\test\\name.txt";
		String readTextFile = StreamUtil.readTextFile(new FileInputStream(str));
		System.out.println(readTextFile);
		
		
		
		
	}

	@Test
	void testReadTextFileFile() {
		String str="I:\\test\\name.txt";
		String readTextFile = StreamUtil.readTextFile(new File(str));
		System.out.println(readTextFile);
	}

	@Test
	void testReadTextFile2List() throws FileNotFoundException {
		String str="I:\\test\\name.txt";
		List<String> readTextFile2List = StreamUtil.readTextFile2List(new File(str));
		for (String string : readTextFile2List) {
			System.out.println(string);
		}
	}

}
