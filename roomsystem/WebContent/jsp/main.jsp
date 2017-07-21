<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>公寓管理系统--首页</title>

	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>

<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				公寓管理系统--首页
			</div>
			<hr>
			<div id="operatehint">
				请根据操作内容点击相应按钮！
			</div>
			<br>
		</div>
		<div id="bodymaindiv">
			<table>
				<tr>
					<th>
						人员管理-针对人员的操作。</th>
					<td>
						<input type="button" class="button" value="人员管理" onclick="pageLoad('personManageSelectInput.jsp')">
					</td>
				</tr>
				<tr>
					<th>
						房间管理-针对房间的操作。</th>
					<td>
						<input type="button" class="button" value="房间管理" onclick="pageLoad('houseManageSelectInput.jsp')">
					</td>
				</tr>
				<tr>
					<th>
						住宿管理-针对住宿情况的操作。</th>
					<td>
						<input type="button" class="button" value="住宿管理" onclick="pageLoad('liveManageSelectInput.jsp')">
					</td>
				</tr>
				<tr>
					<th>
						租金管理-针对租金的操作。</th>
					<td>
						<input type="button" class="button" value="租金管理" onclick="pageLoad('paymentManageSelectInput.jsp')">
					</td>
				</tr>
				<tr>
					<th>
						综合查询管理-针对需要提醒交租等的查询。</th>
					<td>
						<input type="button" class="button" value="综合查询管理" onclick="pageLoad('queryManageMain.jsp')">
					</td>
				</tr>
				<tr>
					<th>
						进帐统计管理-对进帐进行小计及合计查询。</th>
					<td>
						<input type="button" class="button" value="进帐统计管理" onclick="pageLoad('incomeManageSelectInput.jsp')">
					</td>
				</tr>
				<logic:equal name="authority" value="manager">
				<tr>
					<th>
						帐号管理-针对可以使用本系统的帐号的操作。</th>
					<td>
						<input type="button" class="button" value="帐号管理" onclick="pageLoad('userManageSelectInput.jsp')">
					</td>
				</tr>
				</logic:equal>
			</table>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
