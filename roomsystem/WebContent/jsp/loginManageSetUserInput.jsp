<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--帐号设置--设置输入画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body onload="loginManageSetUserInputFormLoad()">
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				帐号设置--设置输入画面
			</div>
			<hr>
			<div id="operatehint">
				请设置各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/loginManageSetUserInputConfirm">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								帐号
							</th>
							<td>
								<span><bean:write name="username" /></span>
								<html:hidden name="loginManageForm" property="username" value="<%=request.getSession().getAttribute(\"username\").toString() %>" />
							</td>
						</tr>
						<tr>
							<th>
								昵称
							</th>
							<td>
								<span><logic:empty name="loginManageForm" property="page_flag">
										<input type="text" class="textbox" name="nickname" maxlength="8" value="<bean:write name="nickname" />">
									</logic:empty>
									<logic:equal name="loginManageForm" property="page_flag" value="page_flow">
										<html:text styleClass="textbox" size="40" name="loginManageForm" property="nickname" maxlength="8"></html:text>
									</logic:equal></span>
							</td>
						</tr>
						</table>
						<table>
						<caption align="left">设置密码： <html:checkbox styleId="if_password" name="loginManageForm" property="if_password" value="yes" onclick="loginManageSetUserInputCheckBoxClicked()"></html:checkbox></caption>
						<tr>
							<th>
								原密码
							</th>
							<td>
								<span><html:password styleClass="textbox" styleId="password" size="40" name="loginManageForm" property="password" maxlength="8"></html:password></span>
							</td>
						</tr>
						<tr>
							<th>
								新密码
							</th>
							<td>
								<span><html:password styleClass="textbox" styleId="new_password" size="40" name="loginManageForm" property="new_password" maxlength="8"></html:password></span>
							</td>
						</tr>
						<tr>
							<th>
								新密码确认
							</th>
							<td>
								<span><html:password styleClass="textbox" styleId="password_confirm" size="40" name="loginManageForm" property="password_confirm" maxlength="8"></html:password></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="确认" styleClass="button"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="pageLoad('main.jsp')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
