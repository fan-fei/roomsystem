<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--帐号管理--检索条件画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				帐号管理--检索条件画面
			</div>
			<hr>
			<div id="operatehint">
				请输入相应检索条件进行检索！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/userManageSelectInputSelect">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								帐号
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="userManageForm" property="username" maxlength="8"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								权限
							</th>
							<td>
								<span><html:select name="userManageForm" property="authority" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="general">普通权限</html:option>
										<html:option value="manager">管理权限</html:option>
									</html:select></span>
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
					</table>
				</div>
				<br />
				<html:button property="create" value="新增" styleClass="button" onclick="pageLoad('userManageCreateInput.jsp')"></html:button> &nbsp; &nbsp; &nbsp;
				<html:submit property="select" value="检索" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
