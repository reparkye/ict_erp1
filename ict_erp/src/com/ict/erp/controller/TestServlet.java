package com.ict.erp.controller;

import java.io.IOException;  //
import java.io.PrintWriter;//
import java.util.Iterator;
import java.util.Map;//

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> params = request.getParameterMap();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("난 호출 될겨");
		
		//Map<String,String[]> para = request.getParameterMap();
		Iterator<String> it = params.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String[] values = params.get(key);
			out.println("니가 입력한"+ key + "값");
			for(int i=0; i<values.length; i++){
				out.print(values[i]);
			}
			out.println("<br>");
		}

		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
