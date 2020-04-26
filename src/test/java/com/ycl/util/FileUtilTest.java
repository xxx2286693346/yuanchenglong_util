package com.ycl.util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String str="a.aa.jpg" ;
		String name1 = FileUtil.getExtendName(str);
		System.out.println(name1);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}
	

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
