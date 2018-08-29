<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<script src="${context}/resources/js/app.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="${context}/resources/vendor/jquery/jquery.min.js"></script>

</head>
<body>
<div id="content-box">
	<form id="modifyForm" name="modifyForm">
	<table>
		<tr>
			<td rowspan="3">
				<img id="profile" src="${img}${profile}" />
			</td>
			
			<td>아이디</td>
			<td colspan="2" id="memberId" value="1"></td>
			<%-- ${user.memberId} --%>
			<%-- <td colspan="2">${user.memberId}</td> --%>
		</tr>
		<tr>
			<td>이름</td>
			<td colspan="2">${user.name}</td>
		</tr>
		<tr>
			<td><a id="moveUpdateForm">비밀번호</a></td>
			<td colspan="2"><input type="text" name="pass" placeholder="${user.pass}"/></td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${user.age}</td>
			<td><a id="moveUpdateTeamForm">팀명</a></td>
			<td>
				<input type="radio" name="teamId" id="ateam"
					value="ateam" />걍놀자
				<input type="radio" name="teamId" id="hteam"
					value="hteam" />지은이네
				<input type="radio" name="teamId" id="steam"
					value="steam" />왕거북이
				<input type="radio" name="teamId" id="cteam"
					value="cteam" />코딩짱 
			</td>
		</tr>
		<tr>
		<td>성별</td>
		<td>${user.gender}</td>
		<td><a id="moveUpdateRollForm">역활</a></td>
		<td>
			<select name="roll" id="roll">
				<option id="leader" value="leader">팀장</option>
				<option id="front" value="front">프론트개발</option>
				<option id="back" value="back">백단개발</option>
				<option id="android" value="android">안드로이드개발</option>
				<option id="minfe" value="minfe">민폐</option>
			</select>	
		</td>
		</tr>
	</table>
	<input type="hidden" name="memberId" value="${user.memberId}"/>
	<input id="modify_bth" type="button" value="수정" />
	</form>
</div>
<form method="POST" enctype="multipart/form-data" action="${context}/member.do?action=fileupload&page=retrieve&userid=${user.memberId}">
  파일 업로드: <input type="file" name="upfile"><br/>
  <input type="submit" value="파일업로드">
</form>
<script>
alert($('input:hidden').val());
$('#memberId').val('2');
app.user.set('${user.memberId}');
</script>
</body> 
</html>
