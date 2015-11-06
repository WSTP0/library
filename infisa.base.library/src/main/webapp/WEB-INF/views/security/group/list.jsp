<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>系统管理-菜单管理</title>
</head>

<body>
	
<script type="text/javascript">
	
	$(document).ready(function(){
		
	});
</script>

	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	<div class="btn-group ">
		<a class="btn" href="${ctx }/security/group/create">新建组</a>
	</div>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th><th>值</th><th>管理者</th><th>操作</th></tr></thead>
		<tbody>
		<c:forEach items="${list}" var="item">
			<tr>
				<td><a href="${ctx}/security/group/update/${item.id}">${item.name} </a></td>
				<td>${item.value}</td>
				<td>${item.boss}</td>
				<td><a href="${ctx }/security/group/delete/${item.id }">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
