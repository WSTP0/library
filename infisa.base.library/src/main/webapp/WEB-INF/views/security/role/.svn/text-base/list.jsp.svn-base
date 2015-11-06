<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>测试</title>
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
		<a class="btn" href="${ctx }/security/role/create">新建角色</a>
	</div>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>角色名称</th><th>操作</th></tr></thead>
		<tbody>
		<c:forEach items="${list}" var="item">
			<tr>
				<td><a href="${ctx}/security/role/update/${item.id}">${item.name} </a></td>
				<td><a href="${ctx }/security/role/delete/${item.id }">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
