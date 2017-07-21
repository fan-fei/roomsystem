<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--房间管理--新增输入画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				房间管理--新增输入画面
			</div>
			<hr>
			<div id="operatehint">
				请完善各项数据！
			</div>
			<font color="red"><html:errors /> </font>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/houseManageCreateInputConfirm">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								<font color="blue">楼号</font>
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
								<font color="blue">楼层</font>
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
								<font color="blue">房间号码</font>
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="houseManageForm" property="house_num" maxlength="4"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								房间类型
							</th>
							<td>
								<span><html:radio name="houseManageForm" property="house_type" value="男士房间">男士房间</html:radio> <html:radio name="houseManageForm" property="house_type" value="女士房间">女士房间</html:radio></span>
							</td>
						</tr>
						<tr>
							<th>
								房间朝向
							</th>
							<td>
								<span><html:select name="houseManageForm" property="house_towards" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="东向">东向</html:option>
										<html:option value="南向">南向</html:option>
										<html:option value="西向">西向</html:option>
										<html:option value="北向">北向</html:option>
										<html:option value="东南">东南</html:option>
										<html:option value="东北">东北</html:option>
										<html:option value="西南">西南</html:option>
										<html:option value="西北">西北</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								可住人数
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="houseManageForm" property="allow_num" maxlength="2"></html:text></span>
							</td>
						</tr>
						<tr>
							<th>
								<font color="green">备注</font>
							</th>
							<td>
								<span><html:text styleClass="textbox" size="40" name="houseManageForm" property="comment" maxlength="64"></html:text></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="确认" styleClass="button"></html:submit> &nbsp; &nbsp; &nbsp;
				<html:button property="back" value="返回" styleClass="button" onclick="pageLoad('houseManageSelectInput.jsp')"></html:button>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
