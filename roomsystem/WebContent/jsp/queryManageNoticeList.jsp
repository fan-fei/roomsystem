<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--综合查询管理--需要提醒交租检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				综合查询管理--需要提醒交租检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				结束日期为最后一次交租的可住期间的结束日期！
			</div>
			<br>
		</div>
		<div id="bodydiv">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th width="9%">
								No
							</th>
							<th width="15%">
								身份证号
							</th>
							<th width="12%">
								姓名
							</th>
							<th width="12%">
								楼号楼层
							</th>
							<th width="12%">
								房间号码
							</th>
							<th width="12%">
								房间类型
							</th>
							<th width="14%">
								迁入日期
							</th>
							<th width="14%">
								结束日期
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:iterate id="element" name="queryManageMainNoticeSelectResult" indexId="index">
							<tr>
								<td width="9%">
									<span><%= index.intValue() + 1 %></span>
								</td>
								<td width="15%">
									<span><bean:write name="element" property="person_num" /></span>
								</td>
								<td width="12%">
									<span><bean:write name="element" property="name" /></span>
								</td>
								<td width="12%">
									<span><bean:write name="element" property="building_floor" /></span>
								</td>
								<td width="12%">
									<span><bean:write name="element" property="house_num" /></span>
								</td>
								<td width="12%">
									<span><bean:write name="element" property="house_type" /></span>
								</td>
								<td width="14%">
									<span><bean:write name="element" property="enter_date" /></span>
								</td>
								<td width="14%">
									<span><bean:write name="element" property="end_date" /></span>
								</td>
							</tr>
						</logic:iterate>
					</table>
				</div>
				<br />
				<html:button property="back" value="返回" styleClass="button" onclick="pageLoad('queryManageMain.jsp')"></html:button>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
