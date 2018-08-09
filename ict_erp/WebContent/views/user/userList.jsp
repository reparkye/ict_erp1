<%@page import="java.util.HashMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/common.jsp" %>
<%!
public List<Map<String,String>> getMemberList(){
	List<Map<String,String>> memberList=new ArrayList<Map<String,String>>();
	String url="jdbc:oragle:thin:@localhost:1521:xe";
	String root="ictu";
	String password="12345678";
	String driver="oracle.jdbc.driver.OracleDriver";
	Connection con=null;
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(url,root,password);
		String sql="selectl * from member_info";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Map<String,String> member=new HashMap<String,String>();
			member.put("miNo",rs.getString("miNo"));
			member.put("miId",rs.getString("miId"));
			member.put("miPwd",rs.getString("miPwd"));
			member.put("diNo",rs.getString("duNo"));	
			member.put("miEmail",rs.getString("miEmail"));
			member.put("miEtc",rs.getString("miEtc"));
			member.put("creDat",rs.getString("creDat"));
			member.put("creTim",rs.getString("creTim"));
			member.put("creUsr",rs.getString("creUsr"));
			member.put("modDat",rs.getString("modDat"));
			member.put("modTim",rs.getString("modTim"));
			member.put("modUsr",rs.getString("modUsr"));
			member.put("lv",rs.getString("lv"));
			member.put("miName",rs.getString("miName"));
			memberList.add(member);
		}
		
	}catch(ClassNotFoundException cnfe){
		
	}catch(SQLException sqle){
		
	}
	
	return memberList;
}
%>

<body>
<%=getMemberList() %>
</body>
</html>
