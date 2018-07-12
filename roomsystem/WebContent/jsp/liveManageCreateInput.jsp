<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.feifan.common.CommonUtility"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--住宿管理--新增输入画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
	<script type="text/javascript" src="javascript/laydate/laydate.js"></script>
	<script> lay('#version').html('-v'+ laydate.v); laydate.render({ elem: '#test1' }); </script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				住宿管理--新增输入画面
			</div>
			<hr>
			<div id="operatehint">
				请完善各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/liveManageCreateInputConfirm">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<span><html:text styleClass="textboxbeforebutton" size="40" readonly="true" name="liveManageForm" property="person_num" maxlength="18"></html:text> <html:button styleClass="buttonaftertextbox" property="refer" value="参照人员管理"
										onclick="formSubmit('../liveManageCreateInputRefer.do','','person')"></html:button></span>
								<html:hidden name="liveManageForm" property="person_id" />
							</td>
						</tr>
						<tr>
							<th>
								姓名
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" readonly="true" name="liveManageForm" property="name" maxlength="4"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								房间号码
							</th>
							<td>
								<span><html:text styleClass="textboxbeforebutton" size="40" readonly="true" name="liveManageForm" property="house_num" maxlength="4"></html:text> <html:button styleClass="buttonaftertextbox" property="refer" value="参照房间管理"
										onclick="formSubmit('../liveManageCreateInputRefer.do','','house')"></html:button></span>
								<html:hidden name="liveManageForm" property="house_id" />
							</td>
						</tr>
						<tr>
							<th>
								楼号楼层
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" readonly="true" name="liveManageForm" property="building_floor" maxlength="4"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								房间类型
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" readonly="true" name="liveManageForm" property="house_type" maxlength="4"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								迁入日期
							</th>
							<td>
								<logic:equal name="DoNotSetDefaultDate" value="DoNotSetDefaultDate">
								<span><html:text styleClass="textbox" size="40" name="liveManageForm" property="enter_date" maxlength="10"  styleId="test1" readonly="true"></html:text></span>
								</logic:equal>
								<logic:notEqual name="DoNotSetDefaultDate" value="DoNotSetDefaultDate">
								<span><html:text styleClass="textbox" size="40" name="liveManageForm" property="enter_date" maxlength="10" value="<%= CommonUtility.getSysDate(2) %>" styleId="test1" readonly="true"></html:text></span>
								</logic:notEqual>
							</td>
						</tr>
						<tr>
							<th>
								床位号码
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="liveManageForm" property="bed_num" maxlength="2" ></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								<font color="green">备注</font>
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="liveManageForm" property="comment" maxlength="64"></html:text></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="确认" styleClass="button"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="pageLoad('liveManageSelectInput.jsp')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
