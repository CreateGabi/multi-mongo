<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1" width="800">
	<tr>
		<td>번호</td>
		<td>id</td>
		<td>pw</td>
		<td>name</td>
		<td>tel</td>
	</tr>
	<c:forEach items="${list}" var="vo" varStatus="status">
	<tr background="lime">
		<td>${status.count}</td>
		<td>${vo.uid}</td>
		<td>${vo.pw}</td>
		<td width="150">
			<a href="one2.member?_id=${vo._id }">
				${vo.name}
			</a>
		</td>
		<td>${vo.tel}</td>
	</tr>
	</c:forEach>
</table>