package com.ict.erp.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ict.erp.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void login(HttpServletRequest req) {
		String id = req.getParameter("id");
		String pwd =  req.getParameter("pwd");
		
		Map<String,String> rMap = new HashMap<String,String>();
		rMap.put("msg","����");
		rMap.put("url","view/index");
		req.setAttribute("rMap", rMap);
		if(id.equals("redfila")) {
			if(pwd.equals("r1r2r3")) {
				HttpSession hs = req.getSession();	
				hs.setAttribute("id",id);
				hs.setAttribute("name","고길동");
				hs.setAttribute("age","30");
				return;
			}
		}
		rMap.put("msg","����");
		rMap.put("url","view/user/login");
	}
}


