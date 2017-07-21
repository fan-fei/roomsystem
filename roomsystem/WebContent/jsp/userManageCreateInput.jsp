<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--帐号管理--新增输入画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				帐号管理--新增输入画面
			</div>
			<hr>
			<div id="operatehint">
				请完善各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/userManageCreateInputConfirm">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								<font color="blue">帐号</font>
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="userManageForm" property="username" maxlength="8"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								密码
							</th>
							<td>
								<span><html:password styleClass="textbox" size="40" name="userManageForm" property="password" maxlength="8"></html:password></span>
							</td>
						</tr>
						<tr>
							<th>
								密码确认
							</th>
							<td>
								<span><html:password styleClass="textbox" size="40" name="userManageForm" property="password_confirm" maxlength="8"></html:password></span>
							</td>
						</tr>
						<tr>
							<th>
								权限
							</th>
							<td>
								<span><html:radio name="userManageForm" property="authority" value="general">普通权限</html:radio> <html:radio name="userManageForm" property="authority" value="manager">管理权限</html:radio></span>
							</td>
						</tr>
						<tr>
							<th>
								昵称
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="userManageForm" property="nickname" maxlength="8"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								<font color="green">备注</font>
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="userManageForm" property="comment" maxlength="64"></html:text></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="确认" styleClass="button"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="pageLoad('userManageSelectInput.jsp')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
