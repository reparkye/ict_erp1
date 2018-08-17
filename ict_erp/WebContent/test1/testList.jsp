<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.ict.erp.common.DBCon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
<div class="container">
	<table class="table table-bordered table-hover">
		<thead>
		<tr>
			<th>번호</th>
			<th>내용</th>
		</tr>
		</thead>
		<tbody>
			<tr>
			<td colspan="2">게시물없음</td>
			</tr>
		</tbody>
<%
Connection con = DBCon.getCon();
String sql = "select itNo, itText from ict_test";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int cnt = 0;	
	while(rs.next()){
		cnt++;
%>		
		<tr>
			<td><%=rs.getInt("itNo") %></td>	
			<td><%=rs.getString() %>
		
	</table>
	<div>
		<button type="button" onclick="move('testInsert.jsp')">게시물 올리기</button>
	</div>
	</div>
	<script>
		function move(page){
			location.href = "/test/"+page;
		}
	
	</script>
</body>
</html>