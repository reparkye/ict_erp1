<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>      

<body>
<%

Map<String,String[]> params = request.getParameterMap();
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

%>

</body>
</html>