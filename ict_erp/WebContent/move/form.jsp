<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/common.jsp" %>      
<body>
<form action = "<%=rPath%>test/">	
취미 : <input type="checkbox" name = "hobby" value ="잠">잠,      <!--  id는 중복 불가지만 name은 중복이 가능하다~!! --> 
	<input type="checkbox" name = "hobby" value ="게임">게임,			
	<input type="checkbox" name = "hobby" value ="음악">음악,		<!-- name은 키값으로 value 값은 밸류로 된다. -->
	<input type="checkbox" name = "hobby" value = "독서">독서
	<br>
거주지역: <select name="address">
			<option value="서울">서울</option>
			<option value="인천">인천</option>
			<option value="천안">천안</option>
			<option value="의정부">의정부</option>
		</select>
	
	<br>
	이름 : <input type="text" name="name">
	<br>
	ID : <input type="text" name="id">
	<br>
	비밀번호 : <input type="password" name="pwd">
	<br>
	
	<button>전송</button>        <!-- type 없으면 submit -->
</form>
</body>
</html>