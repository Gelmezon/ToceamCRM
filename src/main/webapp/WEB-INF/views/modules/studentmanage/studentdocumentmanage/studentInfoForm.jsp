<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>学员档案管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/">学员档案列表</a></li>
		<li class="active"><a href="${ctx}/studentmanage/studentdocumentmanage/studentInfo/form?id=${studentInfo.id}">学员档案<shiro:hasPermission name="studentmanage:studentdocumentmanage:studentInfo:edit">${not empty studentInfo.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="studentmanage:studentdocumentmanage:studentInfo:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="studentInfo" action="${ctx}/studentmanage/studentdocumentmanage/studentInfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">id：</label>
			<div class="controls">
				<form:input path="id" htmlEscape="false" maxlength="20" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">学号：</label>
			<div class="controls">
				<form:input path="code" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">学籍变更：</label>
			<div class="controls">
				<form:input path="statuschange" htmlEscape="false" maxlength="500" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">学生类型：</label>
			<div class="controls">
				<form:input path="studenttype" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">性别：</label>
			<div class="controls">
				<form:input path="sex" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">出生地：</label>
			<div class="controls">
				<form:input path="birthplace" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">出生日期：</label>
			<div class="controls">
				<input name="birthday" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${studentInfo.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">婚姻状况：</label>
			<div class="controls">
				<form:input path="married" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">毕业学校：</label>
			<div class="controls">
				<form:input path="school" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">academy：</label>
			<div class="controls">
				<form:input path="academy" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">院系：</label>
			<div class="controls">
				<form:input path="department" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">专业：</label>
			<div class="controls">
				<form:input path="collegemajor" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">学历：</label>
			<div class="controls">
				<form:input path="schoolrecord" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">毕业时间：</label>
			<div class="controls">
				<form:input path="graduatedate" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cancel：</label>
			<div class="controls">
				<form:input path="cancel" htmlEscape="false" maxlength="1" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">入学时电话号码：</label>
			<div class="controls">
				<form:input path="telephone" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">毕业时电话号码：</label>
			<div class="controls">
				<form:input path="gtelephone" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">电子邮件：</label>
			<div class="controls">
				<form:input path="email" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">QQ号码：</label>
			<div class="controls">
				<form:input path="qq" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">msn：</label>
			<div class="controls">
				<form:input path="msn" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">家庭电话：</label>
			<div class="controls">
				<form:input path="homephone" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">家庭住址：</label>
			<div class="controls">
				<form:input path="homeaddress" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系地址：</label>
			<div class="controls">
				<form:input path="comminucationaddress" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证件号码：</label>
			<div class="controls">
				<form:input path="credentialno" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">监护人：</label>
			<div class="controls">
				<form:input path="guardian" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">监护人电话号码：</label>
			<div class="controls">
				<form:input path="guardianphone" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">和监护人的关系：</label>
			<div class="controls">
				<form:input path="relation" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">紧急联系人：</label>
			<div class="controls">
				<form:input path="urgencyperson" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">紧急联系电话：</label>
			<div class="controls">
				<form:input path="urgencyphone" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">原培训公司：</label>
			<div class="controls">
				<form:input path="traincompany" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">培训时间：</label>
			<div class="controls">
				<form:input path="traintime" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">培训内容：</label>
			<div class="controls">
				<form:input path="traincontext" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">原工作单位：</label>
			<div class="controls">
				<form:input path="oldcompany" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">原单位职位：</label>
			<div class="controls">
				<form:input path="oldheadship" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">原单位薪资：</label>
			<div class="controls">
				<form:input path="oldsalary" htmlEscape="false" maxlength="11" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">家庭背景：</label>
			<div class="controls">
				<form:input path="familybackgroud" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">父母状况：</label>
			<div class="controls">
				<form:input path="parentstatus" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">职业规划：</label>
			<div class="controls">
				<form:input path="jobdesign" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">期望目标：</label>
			<div class="controls">
				<form:input path="target" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">爱好：</label>
			<div class="controls">
				<form:input path="hobby" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">经济能力：</label>
			<div class="controls">
				<form:input path="economy" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">职业素质基础分：</label>
			<div class="controls">
				<form:input path="qulityscore" htmlEscape="false" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">技术能力基础分：</label>
			<div class="controls">
				<form:input path="skillscore" htmlEscape="false" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">职务：</label>
			<div class="controls">
				<form:input path="innerheadship" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">达内毕业时间：</label>
			<div class="controls">
				<input name="daneigraduatedate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${studentInfo.daneigraduatedate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">照片：</label>
			<div class="controls">
				<form:input path="pic" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">picfilename：</label>
			<div class="controls">
				<form:input path="picfilename" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">简历：</label>
			<div class="controls">
				<form:input path="resume" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">resumefilename：</label>
			<div class="controls">
				<form:input path="resumefilename" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">是否还清贷款：</label>
			<div class="controls">
				<form:input path="repayedcredit" htmlEscape="false" maxlength="1" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">careerexclamation：</label>
			<div class="controls">
				<form:input path="careerexclamation" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">就业公司：</label>
			<div class="controls">
				<form:input path="company" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">就业职位：</label>
			<div class="controls">
				<form:input path="headship" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">就业薪水：</label>
			<div class="controls">
				<form:input path="salary" htmlEscape="false" maxlength="11" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">returnvist：</label>
			<div class="controls">
				<form:input path="returnvist" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">other：</label>
			<div class="controls">
				<form:input path="other" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">classes_id：</label>
			<div class="controls">
				<form:input path="classesId" htmlEscape="false" maxlength="20" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">subarea_id：</label>
			<div class="controls">
				<form:input path="subareaId" htmlEscape="false" maxlength="20" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">attendanceno：</label>
			<div class="controls">
				<form:input path="attendanceno" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">班主任评价：</label>
			<div class="controls">
				<form:input path="teacherevaluation" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">项目经理评价：</label>
			<div class="controls">
				<form:input path="pmevaluation" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第一次考试成绩：</label>
			<div class="controls">
				<form:input path="firstwritten" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第二次考试成绩：</label>
			<div class="controls">
				<form:input path="secondwritten" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第三次考试成绩：</label>
			<div class="controls">
				<form:input path="thirdwritten" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">SJCP考试成绩：</label>
			<div class="controls">
				<form:input path="scjp" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第一次项目考核成绩：</label>
			<div class="controls">
				<form:input path="firstpoll" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第二次项目考核成绩：</label>
			<div class="controls">
				<form:input path="secondpoll" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">第三次项目考核成绩：</label>
			<div class="controls">
				<form:input path="thirdpoll" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">file_id：</label>
			<div class="controls">
				<form:input path="fileId" htmlEscape="false" maxlength="20" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="studentmanage:studentdocumentmanage:studentInfo:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>