<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.ict.erp.common.DBCon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/common.jsp" %>

<%
String itNo = request.Parameter("itNo");
String itText = request.Parameter("itText");

Connection con = DBCon.getCon();
String sql = "insert into_test values(?,?)";

PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,itNo);
ps.setString(2, itText);
int rNum = ps.executeUpdate();
if(rNum==1){
%>    
<script>
	alert("ict_test에 저장 됨");
	location.href="/test1/testList.jsp";

</script>
<%
}else{
%>
<script>
alert("저장 안됨");
location.href="/test/testInsert.jsp";
</script>
<%
}
%>
