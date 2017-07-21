<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--帐号管理--新增确认画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				帐号管理--新增确认画面
			</div>
			<hr>
			<div id="operatehint">
				请确认各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/userManageCreateConfirmExecute">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								帐号
							</th>
							<td>
								<span><bean:write name="userManageForm" property="username" /></span>
								<html:hidden name="userManageForm" property="username" />
							</td>
						</tr>
						<tr>
							<th>
								密码
							</th>
							<td>
								<%int passwordLength=Integer.parseInt( request.getAttribute("passwordLength").toString());%>
								<span><%for(int i=0;i<passwordLength;i++){out.print("*");}%></span>
								<html:hidden name="userManageForm" property="password" />
								<html:hidden name="userManageForm" property="password_confirm" />
							</td>
						</tr>
						<tr>
							<th>
								权限
							</th>
							<td>
								<span><logic:equal name="userManageForm" property="authority" value="general">普通权限</logic:equal>
									  <logic:equal name="userManageForm" property="authority" value="manager">管理权限</logic:equal>
								</span>
								<html:hidden name="userManageForm" property="authority" />
							</td>
						</tr>
						<tr>
							<th>
								昵称
							</th>
							<td>
								<span><bean:write name="userManageForm" property="nickname" /></span>
								<html:hidden name="userManageForm" property="nickname" />
							</td>
						</tr>
						<tr>
							<th>
								备注
							</th>
							<td>
								<span><bean:write name="userManageForm" property="comment" /></span>
								<html:hidden name="userManageForm" property="comment" />
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="执行" styleClass="button" onclick="disableDoubleClick();"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../userManageCreateConfirmBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
