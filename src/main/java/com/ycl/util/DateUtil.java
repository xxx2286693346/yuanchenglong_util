package com.ycl.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	/**
	 * 
	    * @Title: random
	    * @Description: TODO(返回一个min-max之间的数值)
	    * @param @param min
	    * @param @param max
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
	}
	
	/**
	 * 
	    * @Title: gitInitMonth
	    * @Description: TODO(返回传入日期的月初日期)
	    * @param @param staDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date gitInitMonth(Date staDate) {
		Calendar c = Calendar.getInstance();
		//用传入的值初始化
		c.setTime(staDate);
		//设置这个月的月初,改变这个月的日期为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);//设置零小时
		c.set(Calendar.MINUTE, 0);//设置零分钟
		c.set(Calendar.SECOND, 0);//设置零秒
		return c.getTime();
	}
	
	/**
	 * 
	    * @Title: gitEndMonth
	    * @Description: TODO(返回传入日期的月末)
	    * @param @param endDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date gitEndMonth(Date endDate) {
		Calendar c = Calendar.getInstance();
		//把传入的值初始化
		c.setTime(endDate);
		//把传入的值月份设置成+1
		c.add(Calendar.MONTH, 1);//设置当前月份+1
		//调用第一个返回月初的方法,把这个+1的月返回成月的月初
		Date gitInitMonth = gitInitMonth(c.getTime());
		//把返回月初的值赋给日期类
		c.setTime(gitInitMonth);
		//把秒-1
		c.add(Calendar.SECOND,-1);
		return c.getTime();
	}
	
	/**
	 * 
	    * @Title: gitAge
	    * @Description: TODO(根据出生日期计算年龄)
	    * @param @param ageDate
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int gitAge(Date ageDate) {
		  Calendar c = Calendar.getInstance();//获取日期类
		  int s_year =c.get(Calendar.YEAR);//获取系统的年
		  int s_month =c.get(Calendar.MONTH);//获取系统的月
		  int s_date =c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		/* 
		 * System.out.println(s_month);
		 * System.out.println(s_year);
		 * System.out.println(s_date);
		 */

		  c.setTime(ageDate);//用出生日期初始日历类

		  int a_year = c.get(Calendar.YEAR);//获取出生的年
		  int a_month =c.get(Calendar.MONTH);//获取出生的月
		  int a_date =c.get(Calendar.DAY_OF_MONTH);//获取出生的日
		  
		  //计算年龄
			int age = s_year - a_year;
			//如果系统月份小于b_month
			if(s_month < a_month) {
				 age--; //年龄减少一岁
			 } 
			//如果月份相等，但是系统的天小于出生的天
			if(s_month == a_month &&s_date < a_date) {
				 age--; //年龄减少一岁
			}
		return age;
	}
	
	
	
}
