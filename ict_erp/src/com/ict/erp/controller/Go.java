package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Go extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String rPath = request.getContextPath();
		uri = uri.replace(rPath, ",");
		uri = "/WEB-INF" + uri +".jsp";
		response.setContentType("text/html);charset=UTf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println(uri);
		PrintWriter out = response.getWriter();
		out.println("세번쨰");
		out.println("입니다.~!!");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
