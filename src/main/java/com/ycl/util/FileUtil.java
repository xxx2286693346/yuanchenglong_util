package com.ycl.util;

import java.io.File;

public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	*/
	/**
	 * 
	    * @Title: getExtendName
	    * @Description: TODO(给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”)
	    * @param @param fileName
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getExtendName(String fileName){
		if(!StringUtil.hasText(fileName) || !fileName.contains("."))
			throw new RuntimeException("不是一个文件");
		
		return fileName.substring(fileName.lastIndexOf("."));
	//TODO 实现代码
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	/**
	 * 
	    * @Title: getTempDirectory
	    * @Description: TODO(返回操作系统临时目录)
	    * @param @return    参数
	    * @return File    返回类型
	    * @throws
	 */
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}

}	
