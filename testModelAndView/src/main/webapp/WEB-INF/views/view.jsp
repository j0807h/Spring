<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view.jsp</title>
</head>
<body>
	컨트롤러에서 이름 붙여서 보낸 데이터는 그냥 이름쓰면 됨! <br />
<p>	
	데이터 : ${data } > <br />
	타입 : ${type } 
</p>	
<a href="/testViewVo">ModelAndView Model Class Version</a>

</body>
</html>