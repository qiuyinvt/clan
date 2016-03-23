<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/weiInc.jsp"%>
<title>添加成员</title>
</head>
<body>
	
	<form:form id="form" method="post" action="/wei/clanMan/add" modelAttribute="clanMan">
		<div class="ui-field-contain">
			<label for="name">姓名：</label>
			<input type="text" name="name" id="name"> 			
			 
		</div>		
        <fieldset data-role="controlgroup">
	        <legend>职位:</legend>
	        <form:radiobuttons path="role" items="${roles}"/>	        
    	</fieldset>
		<input type="submit" value="保存" />  
	</form:form>
	
	
</body>
</html>