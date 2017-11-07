<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>学员档案管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/">学员档案列表</a></li>
		<shiro:hasPermission name="studentmanage:studentdocumentmanage:studentInfo:edit"><li><a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/form">学员档案添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="studentInfo" action="${ctx}/studentmanage/studentdocumentmanage/studentInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>学号：</label>
				<form:input path="code" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li><label>班级：</label>
				<form:input path="classesId" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>学号</th>
				<th>性别</th>
				<th>婚姻状况</th>
				<th>毕业学校</th>
				<th>学历</th>
				<th>入学时电话号码</th>
				<th>毕业时电话号码</th>
				<shiro:hasPermission name="studentmanage:studentdocumentmanage:studentInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="studentInfo">
			<tr>
				<td><a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/form?id=${studentInfo.id}">
					${studentInfo.code}
				</a></td>
				<td>
					${studentInfo.sex}
				</td>
				<td>
					${studentInfo.married}
				</td>
				<td>
					${studentInfo.school}
				</td>
				<td>
					${studentInfo.schoolrecord}
				</td>
				<td>
					${studentInfo.telephone}
				</td>
				<td>
					${studentInfo.gtelephone}
				</td>
				<shiro:hasPermission name="studentmanage:studentdocumentmanage:studentInfo:edit"><td>
    				<a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/form?id=${studentInfo.id}">修改</a>
					<a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/delete?id=${studentInfo.id}" onclick="return confirmx('确认要删除该学员档案吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>