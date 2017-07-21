<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--租金管理--新增确认画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				租金管理--新增确认画面
			</div>
			<hr>
			<div id="operatehint">
				请确认各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/paymentManageCreateConfirmExecute">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								身份证号
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="person_num" /></span>
								<html:hidden name="paymentManageForm" property="person_num" />
								<html:hidden name="paymentManageForm" property="live_id" />
							</td>
							<th>
								姓名
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="name" /></span>
								<html:hidden name="paymentManageForm" property="name" />
							</td>
						</tr>
						<tr>
							<th>
								楼号楼层
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="building_floor" /></span>
								<html:hidden name="paymentManageForm" property="building_floor" />
							</td>
							<th>
								房间号码
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="house_num" /></span>
								<html:hidden name="paymentManageForm" property="house_num" />
							</td>
						</tr>
						<tr>
							<th>
								交租日期
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="pay_date" /></span>
								<html:hidden name="paymentManageForm" property="pay_date" />
							</td>
							<th>
								租金
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="room_rent" /></span>
								<html:hidden name="paymentManageForm" property="room_rent" />
							</td>
						</tr>
						<tr>
							<th>
								水费
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="water_charge" /></span>
								<html:hidden name="paymentManageForm" property="water_charge" />
							</td>
							<th>
								电费
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="power_charge" /></span>
								<html:hidden name="paymentManageForm" property="power_charge" />
							</td>
						</tr>
						<tr>
							<th>
								网费
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="cable_charge" /></span>
								<html:hidden name="paymentManageForm" property="cable_charge" />
							</td>
							<th>
								杂费
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="extra_charge" /></span>
								<html:hidden name="paymentManageForm" property="extra_charge" />
							</td>
						</tr>
						<tr>
							<th>
								暖费
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="heating_charge" /></span>
								<html:hidden name="paymentManageForm" property="heating_charge" />
							</td>
							<th>
								合计
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="total_charge" /></span>
								<html:hidden name="paymentManageForm" property="total_charge" />
							</td>
						</tr>
						<tr>
							<th>
								房间押金
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="room_deposit" /></span>
								<html:hidden name="paymentManageForm" property="room_deposit" />
							</td>
							<th>
								开始日期
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="start_date" /></span>
								<html:hidden name="paymentManageForm" property="start_date" />
							</td>
						</tr>
						<tr>
							<th>
								结束日期
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="end_date" /></span>
								<html:hidden name="paymentManageForm" property="end_date" />
							</td>
							<th>
								备注
							</th>
							<td>
								<span><bean:write name="paymentManageForm" property="comment" /></span>
								<html:hidden name="paymentManageForm" property="comment" />
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="执行" styleClass="button" onclick="disableDoubleClick();"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="disableDoubleClick();formSubmit('../paymentManageCreateConfirmBack.do')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
