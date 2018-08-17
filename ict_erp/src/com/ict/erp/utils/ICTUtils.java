package com.ict.erp.utils;

public class ICTUtils {
	private static final String PRE_FIX = "/WEB-INF/views";
	private static final String SUF_FIX = ".jsp";
	private static final String SEP_STR = "/";

	public static String getCmd(String uri) {
		int idx = uri.lastIndexOf(SEP_STR);      //마지막 / 기준으로 자르는것 
		if(idx == -1) {								
			return null;
		}
		return uri.substring(idx+1);
	}
	public static String getJSPPage(String uri) {
		return PRE_FIX + uri + SUF_FIX;             ///WEB-INF/views +uri +
		
	}
	
	
}


/*//
public class ICTUtils {
	public static String getCmd(String uri){
	int idx = uri.lastIndex("/");
	if(idx == -1){
	return null;
	}
	return uri.substring(idx+1);
}}

//*/