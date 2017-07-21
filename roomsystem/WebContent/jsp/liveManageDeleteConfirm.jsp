<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--住宿管理--删除确认画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				住宿管理--删除确认画面
			</div>
			<hr>
			<div id="operatehint">
				请确认各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/liveManageDeleteConfirmExecute">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="person_num" /></span>
								<html:hidden name="liveManageForm" property="person_num" />
								<html:hidden name="liveManageForm" property="id" />
							</td>
						</tr>
						<tr>
							<th>
								姓名
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="name" /></span>
								<html:hidden name="liveManageForm" property="name" />
							</td>
						</tr>
						<tr>
							<th>
								楼号楼层
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="building_floor" /></span>
								<html:hidden name="liveManageForm" property="building_floor" />
							</td>
						</tr>
						<tr>
							<th>
								房间号码
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="house_num" /></span>
								<html:hidden name="liveManageForm" property="house_num" />
							</td>
						</tr>
						<tr>
							<th>
								房间类型
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="house_type" /></span>
								<html:hidden name="liveManageForm" property="house_type" />
							</td>
						</tr>
						<tr>
							<th>
								迁入日期
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="enter_date" /></span>
								<html:hidden name="liveManageForm" property="enter_date" />
							</td>
						</tr>
						<tr>
							<th>
								床位号码
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="bed_num" /></span>
								<html:hidden name="liveManageForm" property="bed_num" />
							</td>
						</tr>
						<tr>
							<th>
								<font color="green">备注</font>
							</th>
							<td>
								<span><bean:write name="liveManageForm" property="comment" /></span>
								<html:hidden name="liveManageForm" property="comment" />
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="执行" styleClass="button" onclick="disableDoubleClick();"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../liveManageDeleteConfirmBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
