package com.ycl.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilTest {
	

	@Test
	public void testSql() {
		/**
		 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换
		 * ，将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换
		 * 。最后打印出正确拼接的SQL字符串。
		 */	
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date gitInitMonth = DateUtil.gitInitMonth(new Date());
		String format2 = format.format(gitInitMonth);
		Date gitEndMonth = DateUtil.gitEndMonth(new Date());
		String format3 = format.format(gitEndMonth);
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		String replace = sql.replace("{1}", format2).replace("{2}", format3);
		System.out.println(replace);
		
	}
	
	

	@Test
	void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 1);
		Date random = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-MM-dd");
		String format2 = format.format(random);
		System.out.println(format2);
	}
	
	@Test
	void gitInitMonth() {
		Date gitInitMonth = DateUtil.gitInitMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(gitInitMonth));
	}
	
	
	@Test
	void gitEndMonth() {
		Date gitInitMonth = DateUtil.gitEndMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(gitInitMonth));
	}
	
	
	@Test//根据日期计算年龄
	public void testGetAge() {
		
		Calendar c = Calendar.getInstance();
		c.set(2000, 3, 23);
		
		int age = DateUtil.gitAge(c.getTime());
		
		System.out.println(age);
	}

}
