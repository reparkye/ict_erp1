package com.ict.erp.utils;

public class ICTUtils {
	public static String getCmd(String uri) {
		int idx = uri.lastIndexOf("/"); 
		if(idx == -1) {
			return null;
		}
		return uri.substring(idx+1);
	}
}


/*//
public class ICTUtils {
	public static String getCmd(String uri) {
	int idx = uri.lastIndexof("/");
	if(idx == -1){
		return null;
}
	return uri.substring(idx+1);
substring(idx+1);




//*/