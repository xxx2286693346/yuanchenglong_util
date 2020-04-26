package com.ycl.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomUtilTest {

	@Test
	void testRandom() {
			int random = RandomUtil.random(1, 3);
			System.out.println(random);
	}

	@Test
	void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	void testRandomString() {
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
