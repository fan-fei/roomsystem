<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--综合查询管理--房间床位状况检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				综合查询管理--房间床位状况检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				如果剩余床位不为零，则该房间可以继续迁入人员！
			</div>
			<br>
		</div>
		<div id="bodydiv">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th width="10%" >
								No
							</th>
							<th width="10%">
								楼号楼层
							</th>
							<th width="10%">
								房间号码
							</th>
							<th width="10%">
								房间类型
							</th>
							<th width="10%">
								房间朝向
							</th>
							<th width="10%">
								可住人数
							</th>
							<th width="10%">
								已住人数
							</th>
							<th width="10%">
								剩余床位
							</th>
							<th width="20%">
								备注
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:iterate id="element" name="queryManageMainBedSelectResult" indexId="index">
							<tr>
								<td width="10%">
									<span><%= index.intValue() + 1 %></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="building_floor" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_type" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_towards" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="allow_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="already_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="spare_num" /></span>
								</td>
								<td width="20%">
									<span><bean:write name="element" property="comment" /></span>
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
