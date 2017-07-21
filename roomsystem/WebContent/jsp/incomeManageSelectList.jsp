<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--进帐统计管理--检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				进帐统计管理--检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				根据条件查询所得数据！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/incomeManageSelectListBack">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th width="4%" >
								No
							</th>
							<th width="8%">
								楼号
							</th>
							<th width="8%">
								楼层
							</th>
							<th width="8%">
								年度
							</th>
							<th width="8%">
								月度
							</th>
							<th width="8%">
								租金
							</th>
							<th width="8%">
								水费
							</th>
							<th width="8%">
								电费
							</th>
							<th width="8%">
								网费
							</th>
							<th width="8%">
								杂费
							</th>
							<th width="8%">
								暖费
							</th>
							<th width="8%">
								合计
							</th>
							<th width="8%">
								房间押金
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
					<%int i = 1; %>
						<logic:iterate id="element" name="incomeManageSelectInputSelectResult" indexId="index">
							<tr>
								<td width="4%">
								<logic:empty name="element" property="month">
									<logic:empty name="element" property="building_num">总计</logic:empty>
									<logic:notEmpty name="element" property="building_num">小计</logic:notEmpty>
								</logic:empty>
								<logic:notEmpty name="element" property="month">
									<span><%=i++ %></span>
								</logic:notEmpty>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="building_num" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="floor_num" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="year" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="month" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="room_rent" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="water_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="power_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="cable_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="extra_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="heating_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="total_charge" /></span>
								</td>
								<td width="8%">
									<span><bean:write name="element" property="room_deposit" /></span>
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
