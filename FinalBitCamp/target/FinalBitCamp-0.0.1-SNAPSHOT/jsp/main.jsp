<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type"
	content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>로그인 완료</title>

</head>
<body>
	<center>
	<h1>회 원 정 보</h1>

		<table >
			<tr>
				<td align="center" colspan="2">${member.userId }으로 로그인 하셨습니다.</td>
			</tr>
			<tr>
				<td align="center" colspan="2">${member.name }님 환영합니다.</td>
			</tr>
			<tr>
				<td align="center" colspan="2">연락처 : ${member.phone }</td>
			</tr>
			<tr>
				<td align="center" colspan="2">이메일 : ${member.email }</td>
			</tr>
			<tr>
				<td align="center"><input type="button" 
				  value="게시판"  onclick="location.href='boardList.do'"></td>

				<td align="center"><input type="button" 
				value="모든회원보기" onclick="location.href='memberList.do'"></td>
			</tr>
			<tr>
				<td align="center"><input type="button" 
				value="회원정보수정" onclick="location.href='memberUpdateForm.do'"></td>
				<td align="center"><input type="button"value="로그아웃" 
				onclick="location.href='logout.do'">
			</td> 
				
			</tr>
		</table>
			${result }
	</center>
	
</body>
</html>