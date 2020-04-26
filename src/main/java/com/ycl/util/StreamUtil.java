package com.ycl.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	
	/*
	* 方法1：批量关闭流，参数能传无限个。
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	/**
	 * 
	    * @Title: closeAll
	    * @Description: TODO(例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。)
	    * @param @param autoCloseable    参数
	    * @return void    返回类型
	    * @throws
	 */
	public static void closeAll(AutoCloseable...autoCloseable){
		
		if(autoCloseable==null ||autoCloseable.length==0 )
			throw new RuntimeException("参数异常");
		for (AutoCloseable autoCloseable2 : autoCloseable) {
			try {
				autoCloseable2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/* 
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		//构建BufferedReader ,为了调用一行行读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(src));
		String string=null;
		StringBuffer buffer = new StringBuffer();
		try {
			while ((string=reader.readLine()) != null) {
				buffer.append(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(reader);//关流
		}
		return buffer.toString();
	//TODO 实现代码
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		
		try {
			FileInputStream stream = new FileInputStream(txtFile);
			return readTextFile(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	//读取文件到集合
	@SuppressWarnings("resource")
	public static List<String> readTextFile2List(File txtFile) throws FileNotFoundException{
		List<String> list = new ArrayList<String>();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
		
		String string=null;
		try {
			while ((string=bufferedReader.readLine())!=null) {
				list.add(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(bufferedReader);
		}
		
		
		return list;
	}
}
