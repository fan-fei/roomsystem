<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--人员管理--修改输入画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				人员管理--修改输入画面
			</div>
			<hr>
			<div id="operatehint">
				请修改各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/personManageModifyInputConfirm">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<span><bean:write name="personManageForm" property="person_num" />
								</span>
								<html:hidden name="personManageForm" property="person_num" />
								<html:hidden name="personManageForm" property="id" />
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
								<span><html:radio name="personManageForm" property="sex" value="男">男</html:radio> <html:radio name="personManageForm" property="sex" value="女">女</html:radio></span>
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
						<tr>
							<th>
								公司
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="work_place" maxlength="16"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								电话
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="telephone" maxlength="16"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								邮件地址
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="email" maxlength="32"></html:text>
							</td>
						</tr>
						<tr>
							<th>
								<font color="green">备注</font>
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="personManageForm" property="comment" maxlength="64"></html:text>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="确认" styleClass="button"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../personManageModifyInputBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
