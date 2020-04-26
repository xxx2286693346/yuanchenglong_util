package com.ycl.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	void testHasLength() {
		boolean hasLength = StringUtil.hasLength(" ");
		System.out.println(hasLength);
	}

	@Test
	void testHasText() {
		boolean hasLength = StringUtil.hasText(" ");
		System.out.println(hasLength);
	}

	@Test
	void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString();
		System.out.println(randomChineseString);
	}

	@Test
	void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}
	
	@Test
	void gitEmail() {
		boolean gitEmail = StringUtil.gitEmail("2286693346@qq.com");
		System.out.println(gitEmail);
	}
	
	
	@Test
	void gitPhone() {
		boolean gitPhone = StringUtil.gitPhone("15679416672");
		System.out.println(gitPhone);
	}
	
	@Test
	void gitNumber() {
		boolean gitNumber = StringUtil.gitNumber("1");
		boolean git = StringUtil.gitNumber("-1");
		boolean Number = StringUtil.gitNumber("1.1");
		System.out.println(gitNumber);
		System.out.println(git);
		System.out.println(Number);
	}

}
