<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--帐号管理--检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				帐号管理--检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				请选择相应行进行修改或删除！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/userManageSelectListBack">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th  width="10%" >
								No
							</th>
							<th  width="15%">
								操作
							</th>
							<th  width="15%">
								帐号
							</th>
							<th  width="15%">
								权限
							</th>
							<th width="20%">
								昵称
							</th>
							<th width="25%">
								备注
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:iterate id="element" name="userManageSelectInputSelectResult" indexId="index">
							<tr>
								<td width="10%">
									<span><%= index.intValue() + 1 %></span>
								</td>
								<td width="15%">
									<input type="button" class="buttoninlist" value="修改" onclick="formSubmit('../userManageSelectListModify.do','<bean:write name="index"  />')">
									<input type="button" class="buttoninlist" value="删除" onclick="formSubmit('../userManageSelectListDelete.do','<bean:write name="index"  />')">
								</td>
								<td width="15%">
									<span><bean:write name="element" property="username" /></span>
								</td>
								<td width="15%">
									<span><logic:equal name="element" property="authority" value="general">普通权限</logic:equal>
									  <logic:equal name="element" property="authority" value="manager">管理权限</logic:equal></span>
								</td>
								<td width="20%">
									<span><bean:write name="element" property="nickname" /></span>
								</td>
								<td width="25%">
									<span><bean:write name="element" property="comment" /></span>
								</td>
							</tr>
						</logic:iterate>
					</table>
				</div>
				<br />
				<html:submit property="back" value="返回" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
