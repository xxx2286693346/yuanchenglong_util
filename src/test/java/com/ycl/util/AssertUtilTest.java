package com.ycl.util;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class AssertUtilTest {

	@Test
	void testIsTrue() {
		try {
			AssertUtil.isTrue(3>10, "不符合要求");
		} catch (AssertException e) {
			System.out.println(e.getMassage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常,请联系管理员");
		}
	
	}

	@Test
	void testIsFalse() {
		
	}

	@Test
	void testNotNull() {
		
	}

	@Test
	void testIsNull() {
		
	}

	@Test
	void testNotEmptyCollectionOfQString() {
		
	}

	@Test
	void testNotEmptyMapOfQQString() {
		
	}

	@Test
	void testHasText() {
		try {
			AssertUtil.hasText("", "不能为空");
		} catch (AssertException e) {
			System.out.println(e.getMassage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常,请联系管理员");
		}
		
		
		
	}

	@Test
	void testGreaterThanZero() {
		try {
			//正常
			AssertUtil.greaterThanZero(new BigDecimal(100), "值不能小于0");
			//不正常
			AssertUtil.greaterThanZero(new BigDecimal(-1), "值不能小于0");
		} catch (AssertException e) {
			System.out.println(e.getMassage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常,请联系管理员");
		}
	}

}
