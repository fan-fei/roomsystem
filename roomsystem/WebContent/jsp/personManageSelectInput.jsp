<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--人员管理--检索条件画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				人员管理--检索条件画面
			</div>
			<hr>
			<div id="operatehint">
				请输入相应检索条件进行检索！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/personManageSelectInputSelect">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="person_num" maxlength="18"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								姓名
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="name" maxlength="4"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								性别
							</th>
							<td>
								<span><html:select name="personManageForm" property="sex" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="男">男</html:option>
										<html:option value="女">女</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								藉贯
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="native_place" maxlength="32"></html:text>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:button property="create" value="新增" styleClass="button" onclick="pageLoad('personManageCreateInput.jsp')"></html:button> &nbsp; &nbsp; &nbsp;
				<html:submit property="select" value="检索" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
