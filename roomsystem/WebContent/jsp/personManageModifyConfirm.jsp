<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--人员管理--修改确认画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				人员管理--修改确认画面
			</div>
			<hr>
			<div id="operatehint">
				请确认各项数据！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/personManageModifyConfirmExecute">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<span><bean:write name="personManageForm" property="person_num" /></span>
								<html:hidden name="personManageForm" property="person_num" />
								<html:hidden name="personManageForm" property="id" />
							</td>
						</tr>
						<tr>
							<th>
								姓名
							</th>
							<td>
								<span><bean:write name="personManageForm" property="name" /></span>
								<html:hidden name="personManageForm" property="name" />
							</td>
						</tr>
						<tr>
							<th>
								性别
							</th>
							<td>
								<span><bean:write name="personManageForm" property="sex" /></span>
								<html:hidden name="personManageForm" property="sex" />
							</td>
						</tr>
						<tr>
							<th>
								藉贯
							</th>
							<td>
								<span><bean:write name="personManageForm" property="native_place" /></span>
								<html:hidden name="personManageForm" property="native_place" />
							</td>
						</tr>
						<tr>
							<th>
								公司
							</th>
							<td>
								<span><bean:write name="personManageForm" property="work_place" /></span>
								<html:hidden name="personManageForm" property="work_place" />
							</td>
						</tr>
						<tr>
							<th>
								电话
							</th>
							<td>
								<span><bean:write name="personManageForm" property="telephone" /></span>
								<html:hidden name="personManageForm" property="telephone" />
							</td>
						</tr>
						<tr>
							<th>
								邮件地址
							</th>
							<td>
								<span><bean:write name="personManageForm" property="email" /></span>
								<html:hidden name="personManageForm" property="email" />
							</td>
						</tr>
						<tr>
							<th>
								备注
							</th>
							<td>
								<span><bean:write name="personManageForm" property="comment" /></span>
								<html:hidden name="personManageForm" property="comment" />
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="执行" styleClass="button" onclick="disableDoubleClick();"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../personManageModifyConfirmBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
