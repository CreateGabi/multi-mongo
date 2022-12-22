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
			url : "list.memo",
			success : function(result) {
				$("#result").html(result);
			}
		});
		
		/* $("#push").click(function() {
			$.ajax({
				url : "insert.memo",
				data : {
					name : $("#name").val(),
					content : $("#content").val(),
					weather : $("#weather").val()
				},
				success : function() {
					// insert하고, 전체 목록을 다시 가지고 온다.
					$.ajax({
						url : "list.memo",
						success : function(result) {
							$("#result").html(result);
						}
					});
					// 입력값 지우기
					$("#name").val("")
					$("#content").val("")
					$("#weather").val("")
				}
			})
		}) */
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
<h3>멀티 메모장</h3>
<hr color="blue">
	<form action="insert.memo">
		작성자 : <input name="name" value="win">
		내용 : <input name="content" value="win">
		날씨 : <input name="weather" value="win"><br>
		<button id="push">서버로 전송</button>
	</form>
<hr color="blue">	
<div id="result" style="background=pink" ></div>
</body>
</html>