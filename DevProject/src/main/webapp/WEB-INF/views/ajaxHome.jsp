<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html> <!-- html5 declare -->
<html lang="ko">
<head>

<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script> 

<title>Insert title here</title>
</head>
<body>
  Ajax Home
<form>
	BoardNo : <input type="text" name="boardNo" value="" id="boardNo"><br>
	title : <input type="text" name="title" value="" id="title"><br>
	content : <input type="text" name="content" value="" id="content"><br>
	writer : <input type="text" name="writer" value="" id="writer"><br>
</form>

<div>
	<button id="listBtn">LIST</button>
	<button id="readBtn">READ</button>
	<button id="registerBtn">REGISTER</button>
	<button id="deleteBtn">DELETE</button>
	<button id="modifyBtn">MODIFY</button>
	
		
		
</div>

</body>
</html>