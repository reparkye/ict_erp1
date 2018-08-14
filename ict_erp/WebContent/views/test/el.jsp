<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/common.jsp" %>      
<%
String name = "박영근";
application.setAttribute("name", "영근1");
Map<String,String>
map = new HashMap<String,String>();
map.put("name","박영근2");
session.setAttribute("name", "영근2");
request.setAttribute("name", "영근3");
pageContext.setAttribute("name", "영근4");
%>
<body>
${name}<br>          <!-- 제일 낮은것 부터 찾는다 그러므로 pageContext -->
${sessionScope.name.name}
</body>
</html>