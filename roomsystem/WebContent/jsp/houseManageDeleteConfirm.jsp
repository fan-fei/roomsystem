<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--房间管理--删除确认画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				房间管理--删除确认画面
			</div>
			<hr>
			<div id="operatehint">
				请确认各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/houseManageDeleteConfirmExecute">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								楼号
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="building_num" /></span>
								<html:hidden name="houseManageForm" property="building_num" />
							</td>
						</tr>
						<tr>
							<th>
								楼层
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="floor_num" /></span>
								<html:hidden name="houseManageForm" property="floor_num" />
							</td>
						</tr>
						<tr>
							<th>
								房间号码
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="house_num" /></span>
								<html:hidden name="houseManageForm" property="house_num" />
								<html:hidden name="houseManageForm" property="id" />
							</td>
						</tr>
						<tr>
							<th>
								房间类型
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="house_type" /></span>
								<html:hidden name="houseManageForm" property="house_type" />
							</td>
						</tr>
						<tr>
							<th>
								房间朝向
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="house_towards" /></span>
								<html:hidden name="houseManageForm" property="house_towards" />
							</td>
						</tr>
						<tr>
							<th>
								可住人数
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="allow_num" /></span>
								<html:hidden name="houseManageForm" property="allow_num" />
							</td>
						</tr>
						<tr>
							<th>
								备注
							</th>
							<td>
								<span><bean:write name="houseManageForm" property="comment" /></span>
								<html:hidden name="houseManageForm" property="comment" />
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="执行" styleClass="button" onclick="disableDoubleClick();"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../houseManageDeleteConfirmBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
