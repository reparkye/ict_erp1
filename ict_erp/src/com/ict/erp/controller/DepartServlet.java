package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.service.DepartService;
import com.ict.erp.service.impl.DepartServiceImpl;
import com.ict.erp.utils.ICTUtils;
import com.ict.erp.vo.DepartInfo;

public class DepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private DepartService ds = new DepartServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();         /*/erp/depart/list  까지*/
		String rPath = request.getContextPath();
		String cmd = ICTUtils.getCmd(uri);				//커맨드만 빼오라는 것
		uri ="/views" + uri.replace(rPath, "") + ".jsp";		/*/erp/depart/list.jsp  에서 erp 없어짐  그리고 .jsp 생략 가능*/		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		if(cmd==null || cmd.equals("")) {
			pw.println("너임마 잘못 요청했음");
			return;         				        /*      http://localhost/erp/depart/ 다음으로 아무것도 입력 안할경우에         */	
	}
		try {
			if(cmd.equals("list")) {			//리스크끼리 비교했으니 트루
				List<DepartInfo> diList = ds.getDepartList();
				request.setAttribute("diList", diList);
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
				return;
		}else if(cmd.equals("view")) {
			
		}else {
			pw.println("잘못요청");
			return;
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

		public static void main(String[] args) {
			DepartServlet ds = new DepartServlet();
			try {
				ds.doGet(null, null);
			}catch (ServletException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
}
