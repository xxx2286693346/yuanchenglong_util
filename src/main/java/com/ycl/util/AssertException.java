package com.ycl.util;

/**
 * 
    * @ClassName: AssertException
    * @Description: TODO(断言异常类)
    * @author 袁成龙
    * @date 2020年4月26日
    *
 */
public class AssertException extends RuntimeException{

	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = 1L;
	
	private String message;

	public AssertException() {
		super();
	}

	public AssertException(String message) {
		super(message);
		this.message=message;
	}

	public String getMassage() {
		return message;
	}

	public void setMassage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
