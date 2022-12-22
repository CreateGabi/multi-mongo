<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../../header.jsp" %>
</head>
<body>
<h2>회원</h2>
<form action="update2.member">
	번호 : <input type="text" name="_id" value="${vo._id}" readonly="readonly" > 
	id : <input name="uid" size="30" value="${vo.uid}" readonly="readonly"> <br>
	pw : <input name="pw" size="30" value="${vo.pw}" readonly="readonly"><br>
	name : <input name="name" size="30" value="${vo.name}" readonly="readonly"> <br>
	tel : <input name="tel" size="30" value="${vo.tel}" class="td1"> <br>
	<button>회원 수정</button>
</form>
<hr color="red">
<a href="delete2.member?_id=${vo._id}">
	<button>회원 삭제</button>
</a>
<a href="mongo_member.jsp">
	<button>회원 목록</button>
</a>

</body>
</html>
