<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/weiInc.jsp" %>
<title>我的部落</title>
</head>
<body>
	<div data-role="header">
		<a href="#" class="ui-btn ui-icon-home ui-btn-icon-left">主页</a>
		<h1>欢迎访问我的主页</h1>
		<a href="#" class="ui-btn ui-icon-search ui-btn-icon-left">搜索</a>
	</div>
	<div data-role="main" class="ui-content">
		<div>
			<ul>
				<li>部落：${clan.name}</li>
				<li>${clan.created}</li>
			</ul>			
			<ul data-role="listview">
				<c:forEach var="clanMan" items="${clanMans}">
				<li><a href="/wei/clanMan/toView?id=${clanMan.id}">
					<img src=""/>
					<h2>${clanMan.name}</h2>
					<p>${clanMan.role}</p>
				</a></li>				
				</c:forEach>
			</ul>
		</div>
	</div>
	<div data-role="footer">
		<a href="/wei/clanMan/toAdd" class="ui-btn ui-icon-plus ui-btn-icon-left">添加成员</a>
		<a href="/wei/war/warList" class="ui-btn ui-icon-plus ui-btn-icon-left">部落战争</a>			
	</div>
</body>
</html>