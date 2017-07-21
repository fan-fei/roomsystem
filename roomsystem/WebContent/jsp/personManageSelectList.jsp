<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--人员管理--检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				人员管理--检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				请选择相应行进行修改或删除！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/personManageSelectListBack">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th width="4%">
								No
							</th>
							<th  width="8%" >
								操作
							</th>
							<th  width="12%">
								身份证号
							</th>
							<th  width="6%">
								姓名
							</th>
							<th  width="4%">
								性别
							</th>
							<th width="15%">
								藉贯
							</th>
							<th width="15%">
								公司
							</th>
							<th width="12%">
								电话
							</th>
							<th width="13%">
								邮件地址
							</th>
							<th width="11%">
								备注
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:iterate id="element" name="personManageSelectInputSelectResult" indexId="index">
							<tr>
								<td width="4%">
									<span><%= index.intValue() + 1 %></span>
								</td>
								<td width="8%">
									<input type="button" class="buttoninlist" value="修改" onclick="formSubmit('../personManageSelectListModify.do','<bean:write name="index"  />')">
									<input type="button" class="buttoninlist" value="删除" onclick="formSubmit('../personManageSelectListDelete.do','<bean:write name="index"  />')">
								</td>
								<td width="12%">
									<span><bean:write name="element" property="person_num" /></span>
								</td>
								<td width="6%">
									<span><bean:write name="element" property="name" /></span>
								</td>
								<td width="4%">
									<span><bean:write name="element" property="sex" /></span>
								</td>
								<td width="15%">
									<span><bean:write name="element" property="native_place" /></span>
								</td>
								<td width="15%">
									<span><bean:write name="element" property="work_place" /></span>
								</td>
								<td width="12%">
									<span><bean:write name="element" property="telephone" /></span>
								</td>
								<td width="13%">
									<span><bean:write name="element" property="email" /></span>
								</td>
								<td width="11%">
									<span><bean:write name="element" property="comment" /></span>
								</td>
							</tr>
						</logic:iterate>
					</table>
				</div>
				<br>
				<html:submit property="back" value="返回" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
