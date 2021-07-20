<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${type } : 컨트롤러에서 이름 붙여서 보낸 데이터는 그냥 "변수 이름" 작성하면 됨</p>
	<p>${vo } : 모델 클래스의 객체 이름 작성(> PersonVo.class에서 toString 함수에 정의된 형태로 출력됨)</p>
	<p>${vo.name } : 모델클래스(PersonVo.class) 객체의 필드에 접근하고 싶다면 "객체이름.필드이름"</p>
	<hr />

<!-- 	모델클래스 객체로 넘겨 받은 데이터 JSON으로 변환하기 -->
	<h3>JSON은 console창을 확인</h3>
	<script type="text/javascript">
		var str = "${vo}"; //자바스크립트에서 파라미터(모델클래스 객체) 접근하기
		console.log(str);
		
		var obj = { //파라미터를 자바스크립트 객체로 변환
				name : "${vo.name}",
				age : "${vo.age}",
				gender : "${vo.gender}"
		};
		console.log(obj);
	</script>

</body>
</html>