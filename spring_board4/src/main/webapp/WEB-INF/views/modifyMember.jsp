<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

              <form action="modifyMember" method="post">
   
                    <input type="text" name="id" value="${id}"><br>
                    <input type="text" name="pw" value="${pw}"><br>
                    <input type="text" name="name" value="${name}"><br>
                    <input type="submit" value="확인">
            </form>


</body>
</html>