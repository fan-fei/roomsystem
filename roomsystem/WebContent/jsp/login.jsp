<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="com.feifan.common.CommonUtility"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--登录画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<div id="headdiv">
			<div id="firstdiv">
				<a href="http://www.fanfei.tech" target="_blank"><img alt="www.fanfei.tech" src="images/18.png"> </a> <b><font color="blue"><%=CommonUtility.getSysDate(1) %></font></b>
				<%-- <html:button property="modifypassword" styleClass="button" style="width:0px; ">帐号设置</html:button>
				<html:button property="logout" styleClass="button" style="width:0px; ">退出</html:button> --%>
				<br>
				<br>
				<br>
				<span id="title"> <b>公寓管理系统</b></span>
			</div>
			<div id="seconddiv">
				<p align="center">
					<span><a href="login.jsp">欢迎使用公寓管理系统！</a></span>
				</p>
			</div>
		</div>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				公寓管理系统--登录画面
			</div>
			<hr>
			<div id="operatehint">
				请输入帐号密码进行登录！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/loginManageLogin">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								帐号
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="loginManageForm" property="username" maxlength="8"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								密码
							</th>
							<td>
								<span><html:password styleClass="textbox" size="40" name="loginManageForm" property="password" maxlength="8"></html:password></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="登录" styleClass="button" onclick="disableDoubleClick();"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
