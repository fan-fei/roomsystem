<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--房间管理--检索条件画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				房间管理--检索条件画面
			</div>
			<hr>
			<div id="operatehint">
				请输入相应检索条件进行检索！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/houseManageSelectInputSelect">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								楼号
							</th>
							<td>
								<span><html:select name="houseManageForm" property="building_num" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="A楼">A楼</html:option>
										<html:option value="B楼">B楼</html:option>
										<html:option value="C楼">C楼</html:option>
										<html:option value="D楼">D楼</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								楼层
							</th>
							<td>
								<span><html:select name="houseManageForm" property="floor_num" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="1层">1层</html:option>
										<html:option value="2层">2层</html:option>
										<html:option value="3层">3层</html:option>
										<html:option value="4层">4层</html:option>
										<html:option value="5层">5层</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								房间号码
							</th>
							<td>
								<html:text styleClass="textbox" size="40" name="houseManageForm" property="house_num" maxlength="4"></html:text>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:button property="create" value="新增" styleClass="button" onclick="pageLoad('houseManageCreateInput.jsp')"></html:button> &nbsp; &nbsp; &nbsp;
				<html:submit property="select" value="检索" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
