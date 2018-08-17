<%@page import="com.ict.erp.service.LvlService"%>
<%@page import="com.ict.erp.service.impl.LvlServiceImpl"%>
<%@page import="com.ict.erp.dao.LvlDAD"%>
<%@page import="com.ict.erp.vo.LvlInfo"%>
<%@page import="com.ict.erp.dao.impl.LvlDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>      
<body>
<div class="container">
	<table class="table table-bordered table-hover">
	<thead>
		<tr>
		<th>Lv1</th>
		<th>레벨명</th>
		<th>설명</th>
		</tr>
		</thead>
		<tbody>
<%
LvlService ls = new LvlServiceImpl();
ls.getLiList(request);               /* 파라미터에 넘겨진 리퀘스트 서비스한테 넘김?? */
%>									 <!-- $ 이엘 {(중가로) -->
		<c:if test="${empty liList}">       <!-- empty비어있다. 즉 0이거나 null 이여야한다. -->
		<tr>
			<td colspan="3">내용없음</td>
		</tr>
		</c:if>
		<c:forEach var="li" items="${liList}">       <!-- lvl_info만 저장 가능 -->
		<tr>
			<td>${li.lvl}</td>
			<td>${li.liName}</td>
			<td>${li.liDesc}</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>