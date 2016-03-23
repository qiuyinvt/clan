<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page language="java" import="org.apache.taglibs.standard.*"%>
<%@ page language="java" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/weiInc.jsp" %>
<title>部落战争</title>
</head>
<body>
	<div data-role="header">
		<a href="#" class="ui-btn ui-icon-home ui-btn-icon-left">主页</a>
		<h1>部落战争</h1>		
	</div>
	<div data-role="main" class="ui-content">
		<div>						
			<ul data-role="listview">
				<c:forEach var="war" items="${wars}">
				<li><a href="/wei/war/warView?id=${war.id}">
					<img src=""/>
					<h2>${war.name}</h2>
					<p>${war.created}</p>
				</a></li>				
				</c:forEach>
			</ul>
		</div>
	</div>
	<div data-role="footer">
		<a href="/wei/clanMan/up" class="ui-btn ui-icon-plus ui-btn-icon-left">添加成员</a>			
	</div>
</body>
</html>