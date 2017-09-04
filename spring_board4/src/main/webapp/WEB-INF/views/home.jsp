<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world!</h1>
 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>삭제</th>
                <th>수정</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.id}</td>
                    <td>${member.pw}</td>
                    <td>${member.name}</td>
                    <td>
                    <form action="remove" method="post">
                    <input type="hidden" name="id" value=${member.id}>
                    <input type="submit" value="삭제">
                    </form>
                    </td>
                    <td>
                    <form action="modifyMember" method="get">
                    <input type="hidden" name="id" value="${member.id}">
                    <input type="hidden" name="pw" value="${member.pw}">
                    <input type="hidden" name="name" value="${member.name}">
                    <input type="submit" value="수정">
                    </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
 
</body>
</html>


