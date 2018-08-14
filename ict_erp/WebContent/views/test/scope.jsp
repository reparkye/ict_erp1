<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/common.jsp" %>      
<c:set var="title" value="abc" />                    <!-- 변수     /   밸류 -->

 <%
//scope.jsp
application.setAttribute("app", "내가 짱이다.");
session.setAttribute("sess", "난 넘버2");
request.setAttribute("req", "내가 넘버쓰리");
pageContext.setAttribute("page","난 시다바리");
/* RequestDispatcher rd = request.getRequestDispatcher("print.jsp");
rd.forward(request, response); */
%> 
<body>
<%="application : " + application.getAttribute("app")%>
<%="<br>session : " + session.getAttribute("sess")%>
<%="<br>request : " + request.getAttribute("req")%>
<%="<br>pageContext : " + pageContext.getAttribute("page")%>
</body>
</html>