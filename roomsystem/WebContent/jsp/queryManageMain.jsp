<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>公寓管理系统--综合查询管理--操作选择画面</title>

	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>

<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				综合查询管理--操作选择画面
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
						尚未交租，已经到期，即将到期的人员列表。</th>
					<td>
						<input type="button" class="button" value="需要提醒交租查询" onclick="pageLoad('../queryManageMainNoticeSelect.do')">
					</td>
				</tr>
				<tr>
					<th>
						房间的最新使用状况的列表。</th>
					<td>
						<input type="button" class="button" value="房间床位状况查询" onclick="pageLoad('../queryManageMainBedSelect.do')">
					</td>
				</tr>
			</table>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
