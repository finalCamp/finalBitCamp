<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type"
	content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<title>로그인</title>

</head>
<body>

	<center>
		<font color="black">
			<H1>
				<font style="font-size: 50px;">로그인</font>
			</H1>
			<form action="memberLogin.do">
				<table >
					<tr>
						<td width="150px" height="40px" align="center"><b>아이디 :</b></td>
						<td width="150px" height="40px" align="center"><input
							type="text" name="userId"></td>
					</tr>
					<tr>
						<td width="150px" height="40px" align="center"><b>비밀번호 :</b></td>
						<td width="150px" height="40px" align="center"><input
							type="password" name="pw"></td>
					</tr>
					<tr>
						<td colspan="1" align="center" height="40px"><input
							type="submit"  value="로그인"></td>
						<td colspan="1" align="center" height="40px"><input
							type="button"  value="회원가입" onclick="location.href='joinForm.do'"></td>
					</tr>
				</table>
			</form>
			<div style="text-align: center"><input type="image" src="images/naver-login.PNG" 
			height="49px" width="222px" onclick="location.href='naverLogin.do'"> 
			</div>
			<div style="text-align: center"><input type="image" src="images/kakao-login.png" 
			onclick="location.href='https://kauth.kakao.com/oauth/authorize?client_id=1ac3e7706d2467a442f2585681668ea0&'+
	'redirect_uri=http://localhost:8080/campingProject/kakaoLogin.do&response_type=code&scope=account_email'">  
			</div>

		</font>
	</center>
</body>
</html>