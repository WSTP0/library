<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>测试</title>
</head>

<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	<form id="inputForm" action="${ctx}/security/role/save" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${entity.id}"/>
		<fieldset>
			<legend><small>角色添加</small></legend>
			<div class="control-group">
				<label class="control-label">角色名:</label>
				<div class="controls">
					<input type="text" value="${entity.name}" name="name" class="input-large"  />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">标志值:</label>
				<div class="controls">
					<input type="text"  name="value" value="${entity.value}" class="input-large required"/>
				</div>
			</div>
				<div class="control-group">
				<label class="control-label">权限:</label>
				<div class="controls">
					<ul>
						<c:forEach items="${permissions}" var="item">
							<li><input type="checkbox" value="${item.value }">${item.name }</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>		
<script type="text/javascript">
</script>
</body>
</html>
