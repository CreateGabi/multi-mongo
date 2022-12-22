<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
<script>
	$(function() {
		$.ajax({
			url : "list2.member",
			success : function(result) {
				$("#result").html(result);
			}
		});
	})
</script>
<style type="text/css">
	h3{
		width: 800px;
		height: 35px;
		background: pink;
	}
</style>
</head>
<body>
<h3>멀티 회원</h3>
<hr color="blue">
	<form action="insert2.member">
		id : <input name="uid" value="win">
		pw : <input name="pw" value="win">
		name : <input name="name" value="win">
		tel : <input name="tel" value="win">
		<button>서버로 전송</button>
	</form>
<hr color="blue">	
<div id="result" style="background=pink" ></div>
</body>
</html>